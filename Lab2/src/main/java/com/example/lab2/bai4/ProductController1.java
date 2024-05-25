package com.example.lab2.bai4;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.lab2.bai3.Product;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/product")
public class ProductController1 {
	@Autowired
	HttpServletRequest request;

	@GetMapping("bai4")
	public String form(Model model) {
		Product p = new Product();
	 	p.setName("Iphone 16");
		p.setPrice(Double.valueOf(3000));
		model.addAttribute("name", p.getName());
		model.addAttribute("price", p.getPrice());

		return "formbai4";
	}

	@PostMapping("saveBai4")
	public String Save(@ModelAttribute("sanpham") Product p, Model model) {

		String name = p.getName();
		double price = p.getPrice();
		Product st = new Product(name, price);
//	

		model.addAttribute("name", st.getName());
		model.addAttribute("price", st.getPrice());

		return "formbai4";
	}

	@ModelAttribute("items")
	public List<Product> getItems() {
		return Arrays.asList(new Product("A", Double.valueOf(11)), new Product("B", Double.valueOf(12)));
	}
}
