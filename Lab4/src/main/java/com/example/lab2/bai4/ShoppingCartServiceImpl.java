package com.example.lab2.bai4;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.lab2.bai5.DB;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    private Map<Integer, item> cart = new HashMap<>();

    @Override
    public item add(Integer id) {
        if (cart.containsKey(id)) {
            item existingItem = cart.get(id);
            existingItem.setQty(existingItem.getQty() + 1);
            return existingItem;
        } else {
            item newItem = fetchItemById(id);
            if (newItem != null) {
                newItem.setQty(1);
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
    public item update(Integer id, int qty) {
        if (cart.containsKey(id)) {
            item existingItem = cart.get(id);
            existingItem.setQty(qty);
            return existingItem;
        }
        return null;
    }

    @Override
    public void clear() {
        cart.clear();
    }

    @Override
    public Collection<item> getItems() {
        return cart.values();
    }

    @Override
    public int getCount() {
        return cart.values().stream().mapToInt(item::getQty).sum();
    }

    @Override
    public double getAmount() {
        return cart.values().stream().mapToDouble(item -> item.getPrice() * item.getQty()).sum();
    }

    private item fetchItemById(Integer id) {
        return DB.items.get(id);
    }
}
