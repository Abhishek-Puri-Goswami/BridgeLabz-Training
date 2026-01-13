/*
9. SmartCheckout – Supermarket Billing Queue (Queue + HashMap)
Story: 
	● At a supermarket, each checkout counter maintains a Queue of customers. 
	● Each customer has a list of items, and a HashMap is used to fetch price and stock quickly.
Requirements:
	● Add/remove customers from the queue.
	● Fetch item prices from map.
	● Update stock on purchase.
*/

package com.day03.smartcheckoutapp;

public class SmartCheckoutApp {
	public static void main(String[] args) {
		System.out.println("==================================================");
		System.out.println("               SMARTCHECKOUT APP");
		System.out.println("==================================================");
		SmartCheckout store = new SmartCheckout();

		// Add items to inventory
		store.addItemToInventory("Kurkure", 30.0, 95);
		store.addItemToInventory("Dairy-Milk", 98.6, 50);
		store.addItemToInventory("Kit-Kat", 14.5, 80);
		store.addItemToInventory("Snickers", 79.9, 20);
		store.addItemToInventory("Milk", 34.0, 100);
		store.addItemToInventory("Bread", 20.0, 10);
		store.addItemToInventory("Eggs", 7.5, 65);

		store.showInventory();

		// Customers arrive
		Customer c1 = new Customer("C001", "Divyansh Jain");
		c1.addItem("Milk", 2);
		c1.addItem("Bread", 1);
		c1.addItem("Eggs", 12);

		Customer c2 = new Customer("C002", "Akshat Pandey");
		c2.addItem("Rice", 10);
		c2.addItem("Milk", 1);
		c2.addItem("Eggs", 30);

		Customer c3 = new Customer("C003", "Ashish Goswmai");
		c3.addItem("Bread", 3);
		c3.addItem("Milk", 4);

		System.out.println();
		store.addCustomer(c1);
		store.addCustomer(c2);
		store.addCustomer(c3);

		// Start billing
		store.processNextCustomer(); // C001
		store.processNextCustomer(); // C002
		store.processNextCustomer(); // C003

		store.showInventory();
		System.out.println("\n==================================================");
		System.out.println("                THANKS FOR SHOPPING");
		System.out.println("==================================================");
	}
}