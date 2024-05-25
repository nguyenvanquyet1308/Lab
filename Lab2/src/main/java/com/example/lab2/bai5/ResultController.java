package com.example.lab2.bai5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ResultController {
 
	@RequestMapping("/a")
	public String m1() {
		
		return "a";
	}
	@RequestMapping("/b")
	public String m2(Model model) {
		
		model.addAttribute("message","l come form b");
		
		return "forward:/a";
	}
	@RequestMapping("/c")
	public String m3(RedirectAttributes params) {
		
		params.addFlashAttribute("message","l com form c ");
		
		return "redirect:/a";
	}
	@ResponseBody()
	@RequestMapping("/d")
	public String m4() {
		
		return "l come from d ";
	}
	
}
