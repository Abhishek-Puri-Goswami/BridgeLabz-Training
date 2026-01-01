package com.encapsulation.ecommerceplatform;

public class Clothing extends Product implements Taxable {

	// Constructor to initialize clothing product
	public Clothing(int productId, String name, double price) {
		super(productId, name, price);
	}

	// Discount calculation for clothing
	@Override
	public double calculateDiscount() {
		return getPrice() * 0.20; // 20% discount
	}

	// Tax calculation for clothing
	@Override
	public double calculateTax() {
		return getPrice() * 0.12; // 12% GST
	}

	@Override
	public String getTaxDetails() {
		return "GST @ 12%";
	}
}
