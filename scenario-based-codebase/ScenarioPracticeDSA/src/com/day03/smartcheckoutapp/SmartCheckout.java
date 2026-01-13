package com.day03.smartcheckoutapp;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class SmartCheckout {
	// FIFO Customers line
	private Queue<Customer> checkoutQueue;
	// Inventory details
	private Map<String, Item> inventory;

	// constructor
	public SmartCheckout() {
		this.checkoutQueue = new LinkedList<>();
		this.inventory = new HashMap<>();
	}

	// Initializes supermarket inventory
	public void addItemToInventory(String name, double price, int stock) {
		inventory.put(name, new Item(name, price, stock));
	}

	// Customer joins the queue
	public void addCustomer(Customer customer) {
		checkoutQueue.offer(customer);
		System.out.println("-> \"" + customer.getName() + "\" joined the queue. (size:" + checkoutQueue.size() + ")");
	}

	// Process the next customer
	public void processNextCustomer() {
		if (checkoutQueue.isEmpty()) {
			System.out.println("No customers in queue.");
			return;
		}

		Customer customer = checkoutQueue.poll();
		System.out.println("\nBilling: " + customer.getName() + "(Id: " + customer.getId() + ")");

		double total = 0.0;
		boolean canCheckout = true;

		// Try to bill each item in cart
		for (Map.Entry<String, Integer> entry : customer.getCart().entrySet()) {
			String itemName = entry.getKey();
			int quantity = entry.getValue();

			Item item = inventory.get(itemName);
			if (item == null) {
				System.out.println("    ! Item not found: " + itemName);
				canCheckout = false;
				continue;
			}

			if (item.getStock() < quantity) {
				System.out.println("    ! Not enough stock for " + itemName + " (needed: " + quantity + ", available: "
						+ item.getStock() + ")");
				canCheckout = false;
				continue;
			}

			// If available, deduct stock and add to bill 
			item.reduceStock(quantity);
			double cost = item.getPrice() * quantity;
			total += cost;

			System.out.printf("    * %-12s x %02d = Rs.%.2f (stock left: %d)\n", itemName, quantity, cost, item.getStock());
		}

		if (canCheckout) {
			System.out.printf("\n-> Total bill for %s: Rs.%.2f\n", customer.getId(), total);
			System.out.println("-> " + customer.getId() + " left the queue.");
		} else {
			System.out.println("\n-> Checkout failed for " + customer.getId() + " (some items unavailable)");
		}
	}

	// Count customers lined-up
	public int getQueueSize() {
		return checkoutQueue.size();
	}

	// Method to display inventory
	public void showInventory() {
		System.out.println("\nCurrent Inventory:");
		for (Item item : inventory.values()) {
			System.out.println("   " + item);
		}
	}
}