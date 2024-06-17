package com.assignment.admin;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assignment.dao.CustomerDAO;
import com.assignment.entity.Category;
import com.assignment.entity.Customer;

import jakarta.validation.Valid;

@Controller
public class QLCustomer {
	@Autowired
	CustomerDAO daocustomer;

	@RequestMapping("/QLCustomer")
	public String Index(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		List<Customer> items = daocustomer.findAll();
		model.addAttribute("itemCustomer", items);
        
		  // Kiểm tra nếu modal được mở trước đó
		// Kiểm tra nếu modal được mở trước đó
		Boolean modalShown = (Boolean) model.getAttribute("modalShown");
		if (modalShown != null && modalShown) {
		    model.addAttribute("modalShown", true);
		} else {
		    model.addAttribute("modalShown", false);
		}

		
		return "viewAdmin/QLCustomer";
	}
	
	@RequestMapping("/QLCustomer/cr")
	public String Cr(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
	
				
		 return "/viewAdmin/createCustomer";
	}

	@RequestMapping("/QLCustomer/create")
	public String create(@Valid @ModelAttribute("customer") Customer item, BindingResult result, Model model) {
		if (result.hasErrors()) {
			List<Customer> items = daocustomer.findAll();
			model.addAttribute("itemCustomer", items);
			return "viewAdmin/createCustomer";
		}

		item.setRegisteredDate(new Date());
		item.setAdmin(true);
		daocustomer.save(item);
		return "redirect:/QLCustomer";
	}

	@RequestMapping("/QLCustomer/delete/{customerId}")
	public String DeleteUser(@PathVariable("customerId") Integer customerId) {
		daocustomer.deleteById(customerId);
		return "redirect:/QLCustomer";
	}

	@RequestMapping("/QLCustomer/edit/{customerId}")
	public String EditUser(Model model, @PathVariable("customerId") Integer id) {
		Customer customer = daocustomer.findById(id).get();
		model.addAttribute("customer", customer);
		List<Customer> item = daocustomer.findAll();

		model.addAttribute("itemCustomer", item);
		return "viewAdmin/editCustomer";
	}

	@RequestMapping("/QLCustomer/update")
	public String UpdateUser(@Valid @ModelAttribute("customer") Customer item, BindingResult result,Model model) {
           if(result.hasErrors()) {
        	   List<Customer> items = daocustomer.findAll();
        	   model.addAttribute("itemCustomer",items);
        	   return "viewAdmin/editCustomer";
           }
		daocustomer.save(item);

		return "redirect:/QLCustomer";
	}

}
