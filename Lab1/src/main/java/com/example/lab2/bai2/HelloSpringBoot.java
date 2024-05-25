package com.example.lab2.bai2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloSpringBoot {
        @RequestMapping("hello")
        public String Hello() {
        	
        	
        	return"hello";
        }
}
