package com.objectmodeling.levelone;

import java.util.ArrayList;

public class Order {

	private int orderId;
	private ArrayList<Product> products;

	// Constructor to initialize order
	public Order(int orderId) {
		this.orderId = orderId;
		products = new ArrayList<>();
	}

	// Aggregation
	// Method to add product to order
	public void addProduct(Product product) {
		products.add(product);
	}

	// Method to calculate total bill
	public double calculateTotal() {
		double total = 0;

		// Loop to sum product prices
		for (Product product : products) {
			total += product.getPrice();
		}
		return total;
	}

	// Method to display order details
	public void displayOrder() {
		System.out.println("\nOrder ID: " + orderId);

		// Loop to display products
		for (Product product : products) {
			System.out.println("----------------");
			product.displayProduct();
		}

		System.out.println("Total Amount: " + calculateTotal());
	}
}
