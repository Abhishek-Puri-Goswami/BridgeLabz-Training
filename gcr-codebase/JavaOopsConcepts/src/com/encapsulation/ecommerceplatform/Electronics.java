package com.encapsulation.ecommerceplatform;

public class Electronics extends Product implements Taxable {

	// Constructor to initialize electronics product
	public Electronics(int productId, String name, double price) {
		super(productId, name, price);
	}

	// Discount calculation for electronics
	@Override
	public double calculateDiscount() {
		return getPrice() * 0.10;
	}

	// Tax calculation for electronics
	@Override
	public double calculateTax() {
		return getPrice() * 0.18; // 18% GST
	}

	// Tax details for electronics
	@Override
	public String getTaxDetails() {
		return "GST @ 18%";
	}
}
