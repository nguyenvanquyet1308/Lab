package com.example.lab2.bai5;

import java.util.HashMap;
import java.util.Map;

import com.example.lab2.bai4.item;

public class DB {
	public static Map<Integer, item> items = new HashMap<>();
	static {
	items.put(1, new item(1, "Samsung", 10.0, 0));
	items.put(2, new item(2, "Nokia 2021", 20.50, 0));
	items.put(3, new item(3, "iPhone 20", 90.49, 0));
	items.put(4, new item(4, "Motorola", 15.55, 0));
	items.put(5, new item(5, "Seamen", 8.99, 0));
	}
}
