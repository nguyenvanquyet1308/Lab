package com.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assignment.dao.ProductDAO;
import com.assignment.entity.Product;

@Controller
@RequestMapping("/trangchu")
public class ProductThanhToan {
	@Autowired
	ProductDAO daoProduct;

	@RequestMapping("/thanhtoan")
	public String thanhToan(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		List<Product> item = daoProduct.findAll();
		model.addAttribute("itemProduct", item);

		return "viewThanhToan/thanhToan";

	}
}
