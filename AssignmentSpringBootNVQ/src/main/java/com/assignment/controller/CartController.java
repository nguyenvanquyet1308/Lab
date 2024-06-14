package com.assignment.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.assignment.dao.ProductDAO;
import com.assignment.entity.Product;
import com.assignment.library.Cart;
import com.assignment.library.ShoppingCartService;

import jakarta.servlet.http.HttpSession;


@Controller
public class CartController {

	@Autowired
	ProductDAO productService;
	
	@Autowired
	ShoppingCartService cartService;
	
	@RequestMapping("/add")
	public String add(HttpSession session, @RequestParam("id")Integer id,
			@RequestParam(value = "qty", required = false, defaultValue = "1")int qty) {
		Product product = productService.getById(id);
	
		Cart cart = cartService.getCart(session);
		cart.addItem(product, qty);
		return "redirect:/";
	}
	
	@RequestMapping("/remove")
	public String remove(HttpSession session,@RequestParam("id")Integer id) {
		Product product = productService.getById(id);
		Cart cart = cartService.getCart(session);
		cart.removeItem(product);
		
		return "cart";
	}
	
	@RequestMapping("/update")
	public String update(HttpSession session, @RequestParam("id")Integer id,@RequestParam("qty")int qty) {
		
		Product product = productService.getById(id);
		Cart cart = cartService.getCart(session);
		cart.updateItem(product, qty);
		return "cart";
	}
	
}
