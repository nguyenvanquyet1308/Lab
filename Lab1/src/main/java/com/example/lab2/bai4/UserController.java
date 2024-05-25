package com.example.lab2.bai4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	HttpServletRequest request;
	@Autowired
	HttpServletResponse response;

	@GetMapping("home")
	public String createGet() {

		return "CreateUser";
	}

	@PostMapping("create")
	public String createPost() {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		User user = new User(username, password);

		request.setAttribute("user", user);
		
		
		Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("user".equals(cookie.getName())) {
                    System.out.println("User Cookie: " + cookie.getValue());
                    break;
                }
            }
        }

		return "DetailUser";
	}

}
