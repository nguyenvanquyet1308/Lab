package com.assignment.entity;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.dao.ProductDAO;
import com.assignment.dao.ShoppingCartService;



@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

	@Autowired
	ProductDAO daoproduct;
	
	
    private Map<Integer, Product> cart = new HashMap<>();

    @Override
    public Product add(Integer id) {
        if (cart.containsKey(id)) {
        	Product existingItem = cart.get(id);
            existingItem.setQuantity(existingItem.getQuantity()+1);
            return existingItem;
        } else {
        	Product newItem = fetchItemById(id);
            if (newItem != null) {
                newItem.setQuantity(1);
                cart.put(id, newItem);
                return newItem;
            }
            return null;
        }
    }

    @Override
    public void remove(Integer id) {
        cart.remove(id);
    }

    @Override
    public Product update(Integer id, int qty) {
        if (cart.containsKey(id)) {
        	Product existingItem = cart.get(id);
            existingItem.setQuantity(qty);
            return existingItem;
        }
        return null;
    }

    @Override
    public void clear() {
        cart.clear();
    }

    @Override
    public Collection<Product> getItems() {
        return cart.values();
    }

    @Override
    public int getCount() {
        return cart.values().stream().mapToInt(Product::getQuantity).sum();
    }

    @Override
    public double getAmount() {
        return cart.values().stream().mapToDouble(item -> item.getUnitPrice() * item.getQuantity()).sum();
    }

    private Product fetchItemById(Integer id) {
        return daoproduct.findAll().get(id);
    }
}
