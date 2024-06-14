package com.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assignment.dao.CustomerDAO;
import com.assignment.entity.Customer;

@Controller
public class ProfileController {

	@Autowired
	CustomerDAO daoCustomer;

	@RequestMapping("/hoSo")
	public String Index() {

		return "viewHoSo/hoSo";
	}

	@RequestMapping("/hoSo/{customerId}")
	public String EditProfile(@PathVariable("customerId") Integer customerId ,  Model model  ) {
		
		Customer customer = daoCustomer.findById(customerId).get();
		model.addAttribute("customer",customer);
		
		
		List<Customer> item = daoCustomer.findAll();
		model.addAttribute("itemCustomer",item);
		
		
		return "viewHoSo/hoSo";
	}
}
