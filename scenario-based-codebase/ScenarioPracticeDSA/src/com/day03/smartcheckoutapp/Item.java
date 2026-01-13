package com.day03.smartcheckoutapp;

// Represents one item in the supermarket
class Item {
	private String name;
	private double price;
	private int stock;

	// constructor
	public Item(String name, double price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}

	// method to update stock 
	public boolean reduceStock(int quantity) {
		if (quantity > stock) {
			return false;
		}
		stock -= quantity;
		return true;
	}

	// common string representation
	@Override
	public String toString() {
		return String.format("* %-15s : [ Price: Rs.%05.2f, Stock: %02d ]", name, price, stock);
	}
}