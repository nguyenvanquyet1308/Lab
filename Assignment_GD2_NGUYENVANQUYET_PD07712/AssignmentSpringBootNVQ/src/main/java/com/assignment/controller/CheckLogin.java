package com.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.assignment.dao.CustomerDAO;
import com.assignment.entity.Customer;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class CheckLogin {

	@Autowired
	CustomerDAO customerService;

	@Autowired
	HttpServletRequest request;

	@PostMapping("/trangchu/dangNhap")
	public String Login(@RequestParam("email") String email, @RequestParam("password") String password, Model model) {
		try {
			Customer account = customerService.findByEmail(email);
			
			if (account != null && account.getPassword().equals(password)) {
				// model.addAttribute("user",account);
				request.getSession().setAttribute("user", account);
				if (account.isAdmin()) {
					System.out.println("thành công vào admin");
					return "redirect:/trangchu";

				} else {
					System.out.println("thành công vào user");
					return "redirect:/trangchu";
				}
			} else {
				model.addAttribute("message", "Tên đăng nhập hoặc mật khẩu chưa đúng!");
				System.out.println("lỗi 1 ");
				return "/viewLogin/dangNhap";
			}
		} catch (Exception e) {
			model.addAttribute("message", "Đã xảy ra lỗi. Vui lòng thử lại!");
			System.out.println("lỗi 2 " + e);
			return "/viewLogin/dangNhap";
		}
	}

	@RequestMapping("/trangchu/dangXuat")
	public String Logout() {
		request.getSession().setAttribute("user", null);
		
		return "redirect:/trangchu/dangNhap";

	}

}
