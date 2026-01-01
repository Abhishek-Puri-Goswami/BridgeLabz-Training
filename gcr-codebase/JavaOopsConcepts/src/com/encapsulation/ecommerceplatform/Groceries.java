package com.encapsulation.ecommerceplatform;

public class Groceries extends Product {

	// Constructor to initialize grocery product
	public Groceries(int productId, String name, double price) {
		super(productId, name, price);
	}

	// Discount calculation for groceries
	@Override
	public double calculateDiscount() {
		return getPrice() * 0.05;
	}
}
