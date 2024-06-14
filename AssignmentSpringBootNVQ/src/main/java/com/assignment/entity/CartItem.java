package com.assignment.entity;

import com.assignment.entity.Product;

public class CartItem {

	Product product;
	int quantity;
	double subTotal;
	
	public CartItem(Product product) {
		this.product = product;
		this.quantity = 1;
		this.subTotal = product.getUnitPrice();
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

}
