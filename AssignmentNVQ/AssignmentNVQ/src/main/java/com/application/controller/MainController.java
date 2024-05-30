package com.application.controller;
import org.springframework.stereotype.Controller;


import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/admin")
public class MainController {

	@RequestMapping("/home")
	public String homePage(Model model) {
		//System.out.println("chayj dcccccccccccccccccc");
		return "homePage"	;
	}
	@RequestMapping("/sanpham")
	public String sanphamPage(Model model) {
		return "sanphamPage";
	}
	@RequestMapping("/blog")
	public String blogPage(Model model) {
		return "blogPage";
	}
	@RequestMapping("/lienHe")
	public String lienHePage(Model model) {
		return "lienHePage";
	}

	
}
