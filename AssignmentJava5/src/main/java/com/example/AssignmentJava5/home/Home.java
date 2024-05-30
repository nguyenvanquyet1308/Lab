package com.example.AssignmentJava5.home;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/admin")
public class Home {

	@RequestMapping("/home")
	public String homePage(Model model) {
		return "homePage";
	}
	@RequestMapping("/sanpham")
	public String sanphamPage(Model model) {
		return "sanphamPage";
	}
	@RequestMapping("/home")
	public String blogPage(Model model) {
		return "blogPage";
	}
	@RequestMapping("/lienHe")
	public String lienHePage(Model model) {
		return "lienHePage";
	}

	
}
