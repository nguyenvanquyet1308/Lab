package com.assignment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.assignment.dao.ProductDAO;
import com.assignment.entity.Customer;
import com.assignment.entity.Product;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.websocket.server.PathParam;

@Controller
@RequestMapping("/trangchu")
public class ProductTrangChu {
	@Autowired
	ProductDAO daoProduct;
	@Autowired
	HttpServletRequest request;

//	@GetMapping
//	public String index(Model model) {
//		Product product = new Product();
//		model.addAttribute("product",product);
//		List<Product> item = daoProduct.findAll();
//		model.addAttribute("itemProduct", item);
//		System.out.println("ddaya"+product);
//		return "viewTrangChu/trangKhachHang";
//	}
	@GetMapping("")
	public String paginate(Model model, @RequestParam("p") Optional<Integer> p) {
		Pageable pageable = PageRequest.of(p.orElse(0), 9);
		{
			// Pageable pageable = PageRequest.of(2, 5);
			Page<Product> page = daoProduct.findAll(pageable);
			model.addAttribute("page", page);
			Product product = new Product();
			model.addAttribute("product", product);
			List<Product> item = daoProduct.findAll();
			model.addAttribute("itemProduct", item);
			return "viewTrangChu/trangKhachHang";
		}
	}
	

	@RequestMapping("/{productId}")
	@ResponseBody
	public Optional<Product> Showid(@PathVariable("productId") Integer id) {
		return daoProduct.findById(id);
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
