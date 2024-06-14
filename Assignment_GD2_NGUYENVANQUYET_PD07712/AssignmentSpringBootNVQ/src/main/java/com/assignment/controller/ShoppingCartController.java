package com.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.assignment.dao.ProductDAO;
import com.assignment.dao.ShoppingCartService;
import com.assignment.library.DBShoppingCart;


@Controller
public class ShoppingCartController {

	@Autowired
	ShoppingCartService cart;
	@Autowired
	ProductDAO productDao;
	
	@RequestMapping("/trangchu/gioHang")
	public String Index(Model model) {
		
		model.addAttribute("cart", cart);
		model.addAttribute("items",DBShoppingCart.items.values());

		
		
		return "viewGioHang/GioHang";
	}
	
//	@RequestMapping("/cart/view")
//	public String view(Model model) {
//		model.addAttribute("cart", cart);
//		model.addAttribute("items",DBShoppingCart.items.values());
//
//		return "cart/index";
//	}

	@RequestMapping("/trangchu/gioHang/{productId}")
	public String add(@PathVariable("productId") Integer id) {
		cart.add(id);
		return "redirect:/trangchu/gioHang"; // hiển thị giỏ hàng
	}

	@RequestMapping("/trangchu/remove/{productId}")
	public String remove(@PathVariable("productId") Integer id) {
		cart.remove(id);
		return "redirect:/trangchu/gioHang";
	}

	@RequestMapping("/trangchu/update/{productId}")
	public String update(@PathVariable("productId") Integer productId, @RequestParam("quantity") Integer qty) {
		cart.update(productId, qty);
		return "redirect:/trangchu/gioHang";
	}

	@RequestMapping("/trangchu/clear")
	public String clear() {
		cart.clear();
		return "redirect:/trangchu/gioHang";
	}

}
