package com.example.lab5.lab6.bai3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.lab5.RepositoryEntity.ProductRepository;

@Controller
public class ReportController {
	@Autowired
	ProductRepository dao;

	@RequestMapping("/category/report")
	public String inventory(Model model) {
		List<Report> items = dao.getInventoryByCategory();
		model.addAttribute("itemReport", items);
		return "category/report";
	}
}
