package com.assignment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.assignment.dao.ProductDAO;
import com.assignment.entity.Product;

@Controller
public class ShowProduct {
           @Autowired
           ProductDAO daoProduct;
	
//	@RequestMapping("/trangchu/sanpham")
//	public String sanPham(Model model) {
//		Product product = new Product();
//		model.addAttribute("product",product);
//		List<Product> item = daoProduct.findAll();
//		model.addAttribute("itemProduct", item);
//		return "viewSanPham/sanPham";
//	}
	@RequestMapping("/trangchu/sanpham")
	public String paginate(Model model, @RequestParam("p") Optional<Integer> p) {
		Pageable pageable = PageRequest.of(p.orElse(0), 9);
		{
			// Pageable pageable = PageRequest.of(2, 5);
			Page<Product> page = daoProduct.findAll(pageable);
			model.addAttribute("page", page);
			return "viewSanPham/sanPham";
		}
	}
}
