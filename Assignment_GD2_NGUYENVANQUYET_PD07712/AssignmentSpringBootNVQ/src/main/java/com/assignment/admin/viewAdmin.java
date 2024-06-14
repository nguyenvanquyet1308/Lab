package com.assignment.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class viewAdmin {

	@GetMapping
	public String index() {

		return "/viewAdmin/trangAdmin";
	}


	
}
