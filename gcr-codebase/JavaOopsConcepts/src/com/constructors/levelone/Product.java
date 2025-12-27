package com.constructors.levelone;

public class Product {
	// Instance variables
	private String productName;
	private double price;

	// Class variable
	private static int totalProducts = 0;

	// Constructor increments product count
	public Product(String productName, double price) {
		this.productName = productName;
		this.price = price;
		totalProducts++;
	}

	// Displays product details
	public void displayProductDetails() {
		System.out.println("Product Name: " + productName);
		System.out.println("Product Price: " + price);
	}

	// Displays total products created
	public static void displayTotalProducts() {
		System.out.println("Total Products: " + totalProducts);
	}

	public static void main(String[] args) {
		Product p1 = new Product("Laptop", 55000);
		Product p2 = new Product("Mobile", 25000);

		p1.displayProductDetails();
		p2.displayProductDetails();

		Product.displayTotalProducts();
	}
}
