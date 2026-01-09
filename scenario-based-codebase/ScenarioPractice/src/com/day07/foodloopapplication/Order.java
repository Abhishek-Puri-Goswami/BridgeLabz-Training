package com.day07.foodloopapplication;

import java.util.ArrayList;

public class Order implements IOrderable {

	private ArrayList<FoodItem> items;
	private double total;

	// constructor
	public Order() {
		items = new ArrayList<>();
		total = 0;
	}

	// method to add order
	public void addItem(FoodItem item) {
		if (item.reduceStock()) {
			items.add(item);
			total += item.getPrice();
		}
	}

	// Applies discount based on total amount
	public double applyDiscount() {
		if (total >= 500)
			return total * 0.10;
		if (total >= 300)
			return total * 0.05;
		return 0;
	}

	@Override
	public void placeOrder() {
		System.out.println("Order placed successfully.");
	}

	@Override
	public void cancelOrder() {
		System.out.println("Order cancelled.");
	}

	public double getFinalAmount() {
		return total - applyDiscount();
	}

	public double getTotal() {
		return total;
	}
}
