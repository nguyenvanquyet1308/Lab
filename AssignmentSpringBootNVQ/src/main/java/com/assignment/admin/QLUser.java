package com.assignment.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assignment.dao.CustomerDAO;

import com.assignment.entity.Customer;

@Controller
public class QLUser {
	@Autowired
	CustomerDAO daocustomer;

	@RequestMapping("/admin/QLUser")
	public String Index(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		List<Customer> items = daocustomer.findAll();
		model.addAttribute("itemCustomer", items);

		return "viewAdmin/QLUser";
	}
}
