package com.example.lab2.bai4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class item {
	Integer id;
	String name;
	double price;
	int qty = 1;
}