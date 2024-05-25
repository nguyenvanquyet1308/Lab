package com.example.lab2.bai2;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.lab2.bai1.ParamService;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class AccountController {
	@Autowired
	CookieService cookieService;
	@Autowired
	ParamService paramService;
	@Autowired
	SessionService sessionService;
	@Autowired
	HttpServletRequest request;

	@GetMapping("/account/login")
	public String Login1() {

		return "login";
	}

	@PostMapping("/account/login")
	
	public String login2() {

		String username = paramService.getString("username", "");

		String password = paramService.getString("password", "");
		boolean remember = paramService.getBoolean("remember", false);
		System.out.println(username + password);
		
		if (username.equals("poly") && password.equals("123")) {
			sessionService.set("username", username);
			System.out.println("set thanhf coong");
		}
		if (remember) {
			cookieService.add(username,password, 10);
			System.out.println("đã nhớ");
		} else {
			cookieService.remove("user");
		}
		
		
		String userCookies = cookieService.getCookies("userName");
		String passCookies = cookieService.getCookies("password");
		request.setAttribute("userName", username);
		request.setAttribute("password", password);

		return "login";
	}

}
