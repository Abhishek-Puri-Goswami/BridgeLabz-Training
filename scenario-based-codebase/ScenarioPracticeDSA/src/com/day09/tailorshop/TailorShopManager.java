package com.day09.tailorshop;

import java.util.ArrayList;
import java.util.List;

public class TailorShopManager {

	private List<Order> orders;

	// constructor
	public TailorShopManager() {
		this.orders = new ArrayList<>();
	}

	// method for adding new order using insertion sort (sorted by deadline)
	public void addOrder(Order newOrder) {
		// if list is empty -> just add
		if (orders.isEmpty()) {
			orders.add(newOrder);
			return;
		}

		// find correct position
		int i;
		for (i = 0; i < orders.size(); i++) {
			// compare deadlines (string comparison works for YYYY-MM-DD format)
			if (newOrder.getDeadline().compareTo(orders.get(i).getDeadline()) <= 0) {
				break;
			}
		}

		// insert at correct position
		orders.add(i, newOrder);
	}

	// method for displaying all pending orders
	public void showPendingOrders() {
		if (orders.isEmpty()) {
			System.out.println("No pending orders today.");
			return;
		}

		System.out.println("----------------------------------------------------------");
		System.out.println("ID     | Customer        | Garment            | Deadline");
		System.out.println("----------------------------------------------------------");

		for (Order order : orders) {
			System.out.println(order);
		}

		System.out.println("----------------------------------------------------------");
		System.out.println("Total pending orders: " + orders.size() + "\n");
	}

	// method for getting number of orders
	public int getOrderCount() {
		return orders.size();
	}
}