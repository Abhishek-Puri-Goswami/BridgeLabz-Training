package com.day07.flashdealz;

public class Product {
	private String name;
	private double originalPrice;
	private double discountPrice;
	private double discountPercentage;

	// constructor
	public Product(String name, double originalPrice, double discountPrice) {
		this.name = name;
		this.originalPrice = originalPrice;
		this.discountPrice = discountPrice;
		// calculate discount percentage
		this.discountPercentage = ((originalPrice - discountPrice) / originalPrice) * 100;
	}

	// method to get discount percentage
	public double getDiscountPercentage() {
		return discountPercentage;
	}

	// good string representation
	@Override
	public String toString() {
		return String.format("%-25s | Original: Rs. %6.0f | Deal: Rs. %6.0f | Discount: %5.1f%%", name, originalPrice,
				discountPrice, discountPercentage);
	}
}