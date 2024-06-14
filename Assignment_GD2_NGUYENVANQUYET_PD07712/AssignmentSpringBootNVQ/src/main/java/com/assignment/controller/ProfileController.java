package com.assignment.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class ProfileController {

	
	@RequestMapping("/trangchu/hoSo")
	public String Index() {
		
		
		return "viewHoSo/hoSo";
	}
}
