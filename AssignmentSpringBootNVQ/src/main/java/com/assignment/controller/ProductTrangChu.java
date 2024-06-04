package com.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assignment.dao.ProductDAO;
import com.assignment.entity.Product;

@Controller
@RequestMapping("/trangchu")
public class ProductTrangChu {
	@Autowired
	ProductDAO daoProduct;

	@GetMapping
	public String index(Model model) {
		List<Product> product = daoProduct.findAll();
		model.addAttribute("itemProduct", product);
		System.out.println("ddaya"+product);
		return "viewTrangChu/trangKhachHang";
	}
	@RequestMapping("sanpham")
	public String sanPham() {
		
		return "viewSanPham/sanPham";
	}
	@RequestMapping("dangNhap")
	public String dangNhap() {
		
		return "viewLogin/dangNhap";
	}
	@RequestMapping("dangKy")
	public String dangKy() {
		
		return "viewLogin/dangKy";
	}
	
}
