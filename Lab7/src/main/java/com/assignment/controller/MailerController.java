package com.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.mail.MessagingException;

@Controller
public class MailerController {
	@Autowired
	MailerServiceImpl mailer;

	


	@ResponseBody
	@RequestMapping("/mailer/demo")
	public String demo(Model model) {
		try {
			mailer.send("nguyenquyet2017zz@gmail.com", "Subject", "Body");
			return "OK";
		} catch (MessagingException e) {
			return e.getMessage();
		}
	}

	@ResponseBody
	@RequestMapping("/mailer/demo1")
	public String demo1(Model model) {
		mailer.queue("nguyenquyet2017zz@gmail.com", "Subject", "Body");
		return "Mail của bạn sẽ được gửi đi trong giây lát";
	}

	@RequestMapping("hello")

	public String index() {

		return "send-email";
	}
}
