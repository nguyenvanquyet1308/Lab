package com.example.lab2.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class Home {
	@GetMapping("/home")
        public String home() {
        	
		
		return "home";
        }
}
