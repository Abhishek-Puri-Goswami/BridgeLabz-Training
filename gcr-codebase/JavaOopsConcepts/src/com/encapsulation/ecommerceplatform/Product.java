package com.encapsulation.ecommerceplatform;

public abstract class Product {

	private int productId;
	private String name;
	private double price;

	// Constructor to initialize product details
	public Product(int productId, String name, double price) {
		this.productId = productId;
		this.name = name;
		this.price = price;
	}

	// Abstract method to calculate discount
	public abstract double calculateDiscount();

	// Concrete method to display product details
	public void displayDetails() {
		System.out.println("Product ID : " + productId);
		System.out.println("Name       : " + name);
		System.out.println("Base Price : " + price);
	}

	// Getters and setters
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
