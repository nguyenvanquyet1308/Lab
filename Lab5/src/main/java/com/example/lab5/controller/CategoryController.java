package com.example.lab5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.lab5.RepositoryEntity.CategoryRepository;
import com.example.lab5.entity.Category;

@Controller
public class CategoryController {

	@Autowired
	CategoryRepository daoCategory;

	@RequestMapping("/category/index")
	public String index(Model model) {

		Category category = new Category();
		model.addAttribute("item", category);
		List<Category> items = daoCategory.findAll();
		model.addAttribute("items", items);

		return "category/index";

	}

	@RequestMapping("/category/edit/{id}")
	public String edit(Model model, @PathVariable("id") String id) {
		Category item = daoCategory.findById(id).get();
		model.addAttribute("item", item);
		List<Category> items = daoCategory.findAll();
		model.addAttribute("items", items);
		return "category/index";
	}

	@RequestMapping("/category/create")
	public String create(Category item) {
		daoCategory.save(item);
		return "redirect:/category/index";
	}

	@RequestMapping("/category/update")
	public String update(Category item) {
		daoCategory.save(item);
		return "redirect:/category/edit/" + item.getId();
	}

	@RequestMapping("/category/delete/{id}")
	public String create(@PathVariable("id") String id) {
		daoCategory.deleteById(id);
		return "redirect:/category/index";
	}

}
