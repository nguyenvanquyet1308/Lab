package com.example.lab5.lab6.bai1;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.lab5.RepositoryEntity.ProductRepository;
import com.example.lab5.entity.Product;

@Controller
public class ProductControllerLab6 {
	@Autowired
	ProductRepository dao;
    
	@RequestMapping("/product/search")
	public String search(Model model, @RequestParam("min") Optional<Double> min,
			@RequestParam("max") Optional<Double> max) {
		double minPrice = min.orElse(Double.MIN_VALUE);
		double maxPrice = max.orElse(Double.MAX_VALUE);
		List<Product> items = dao.findByPrice(minPrice, maxPrice);
		model.addAttribute("itemSearch", items);

		return "product/search";
	}

}
