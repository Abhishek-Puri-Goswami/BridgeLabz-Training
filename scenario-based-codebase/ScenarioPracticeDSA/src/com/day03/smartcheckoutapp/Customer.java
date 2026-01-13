package com.day03.smartcheckoutapp;

import java.util.HashMap;
import java.util.Map;

// Represents one customer and their shopping cart
class Customer {
	private String customerId;
	private String customerName;
	private Map<String, Integer> cart;

	// constructor
	public Customer(String id, String customerName) {
		this.customerId = id;
		this.customerName = customerName;
		this.cart = new HashMap<>();
	}

	public String getId() {
		return customerId;
	}
	
	public String getName() {
		return customerName;
	}

	// Add Item to Cart
	public void addItem(String itemName, int quantity) {
		cart.put(itemName, cart.getOrDefault(itemName, 0) + quantity);
	}

	// Get customer items cart
	public Map<String, Integer> getCart() {
		return cart;
	}

	// common string representation
	@Override
	public String toString() {
		return "Customer: [ " + customerName + " (" + customerId + "), Cart: " + cart + " ]";
	}
}
