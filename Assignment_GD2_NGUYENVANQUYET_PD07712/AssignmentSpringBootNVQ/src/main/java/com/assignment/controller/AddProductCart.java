package com.assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddProductCart {
	
	
//	
//	@RequestMapping("/cart/add/{id}")
//	public String add(@PathVariable("id") Integer id) {
//		cart.add(id);
//		return "redirect:/cart/view"; // hiển thị giỏ hàng
//	}
//
//	@RequestMapping("/cart/remove/{id}")
//	public String remove(@PathVariable("id") Integer id) {
//		cart.remove(id);
//		return "redirect:/cart/view";
//	}
//
//	@RequestMapping("/cart/update/{id}")
//	public String update(@PathVariable("id") Integer id, @RequestParam("qty") Integer qty) {
//		cart.update(id, qty);
//		return "redirect:/cart/view";
//	}
//
//	@RequestMapping("/cart/clear")
//	public String clear() {
//		cart.clear();
//		return "redirect:/cart/view";
//	}
}
