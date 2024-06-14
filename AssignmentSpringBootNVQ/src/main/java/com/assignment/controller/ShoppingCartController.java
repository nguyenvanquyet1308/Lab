package com.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.assignment.dao.ProductDAO;
import com.assignment.dao.ShoppingCartService;
import com.assignment.entity.Product;
import com.assignment.library.DBShoppingCart;

import jakarta.servlet.http.HttpSession;

@Controller
public class ShoppingCartController {

	@Autowired
	ShoppingCartService cart;
	@Autowired
	ProductDAO productDao;

	@RequestMapping("/gioHang")
	public String Index(Model model, HttpSession session) {

		model.addAttribute("cart", cart);
		model.addAttribute("items", cart.getItems());
	//	model.addAttribute("items", DBShoppingCart.items.values());

//		Product Productcart = (Product) session.getAttribute("cart");
//		if (Productcart == null) {
//			Productcart = new Product();
//			session.setAttribute("cart", Productcart);
//		}
//		model.addAttribute("cart", cart);

		return "viewGioHang/GioHang";
	}

//	@RequestMapping("/cart/view")
//	public String view(Model model) {
//		model.addAttribute("cart", cart);
//		model.addAttribute("items",DBShoppingCart.items.values());
//
//		return "cart/index";
//	}

	@RequestMapping("/gioHang/{productId}")
	public String add(@PathVariable("productId") Integer id) {
		cart.add(id);
		
		return "redirect:/gioHang"; // hiển thị giỏ hàng
	}

	@RequestMapping("gioHang/remove/{productId}")
	public String remove(@PathVariable("productId") Integer productId) {
		cart.remove(7);
		System.out.println("ddax chay toi day");
		return "redirect:/gioHang";
	}

	@RequestMapping("gioHang/update/{productId}")
	public String update(@PathVariable("productId") Integer productId, @RequestParam("quantity") Integer qty) {
		cart.update(productId, qty);
		return "redirect:/gioHang";
	}

	@RequestMapping("/clear")
	public String clear() {
		cart.clear();
		return "redirect:/gioHang";
	}

}
