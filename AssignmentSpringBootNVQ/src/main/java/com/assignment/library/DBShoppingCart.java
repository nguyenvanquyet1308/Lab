package com.assignment.library;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.assignment.dao.ProductDAO;
import com.assignment.entity.Product;

import jakarta.annotation.PostConstruct;


public class DBShoppingCart {
	@Autowired
	ProductDAO productDao;
	
	public static Map<Integer, Product> items = new HashMap<>();
    
	
    @PostConstruct
    public void init() {
        List<Product> productList = productDao.findAll();
        for (Product product : productList) {
            items.put(product.getProductId(), product);
        }
    }
}
