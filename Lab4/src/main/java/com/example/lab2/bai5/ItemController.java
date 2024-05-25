package com.example.lab2.bai5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ItemController {
	@RequestMapping("/item/index")
	public String list(Model model) {
		model.addAttribute("items", DB.items.values());
		return "item/index";
	}
}
