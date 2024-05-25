package com.example.lab2.bai3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

	@GetMapping("product/formbai")
	public String form() {
		return "formbai3";
	}
	@PostMapping("product/save")
	public String save(Product product, Model model) {

		String name = product.getName();
		Double price = product.getPrice();

		String pr = String.format("%s", name);
		model.addAttribute("name", pr);
		
		model.addAttribute("price", price);

		return "formbai3";
	}

}
