package com.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.mail.MessagingException;

@Controller
public class SendMail {

	@Autowired
	MailerServiceImpl mailer;

	@GetMapping("SendMail")
	public String index() {

		return "send-email";
	}

	@ResponseBody
	@PostMapping("/send-email")
	public String sendEmail(@RequestParam("to") String to, @RequestParam("subject") String subject,
			@RequestParam("text") String text, Model model) {
		try {
			mailer.send(to, subject, text);
			return "Email sent successfully";
		} catch (MessagingException e) {
			e.printStackTrace();
			return "Failed to send email: " + e.getMessage();
		}
	}
}
