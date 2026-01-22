/*
9. TailorShop – Sorting Orders by Delivery Deadline (Insertion Sort)
Story: At a tailor’s shop, new clothing orders are received every hour. Each order has a
deadline, and the owner maintains a sorted list of orders by delivery date. Since each new
order is inserted into a nearly sorted list, Insertion Sort is simple and fast.
Concepts Involved:
● Insertion Sort
● Real-time updates
● Deadline-based sorting
*/

package com.day09.tailorshop;

public class TailorShopApp {
	public static void main(String[] args) {
		TailorShopManager shop = new TailorShopManager();

		System.out.println("============================================================");
		System.out.println("        New orders arriving throughout the day");
		System.out.println("============================================================\n");

		shop.addOrder(new Order(101, "Amit Sharma", "Sherwani", "2026-01-25"));
		shop.showPendingOrders();

		shop.addOrder(new Order(102, "Priya Patel", "Lehenga", "2026-01-23"));
		shop.showPendingOrders();

		shop.addOrder(new Order(103, "Rahul Verma", "Kurta Pajama", "2026-01-28"));
		shop.showPendingOrders();

		shop.addOrder(new Order(104, "Sneha Gupta", "Anarkali Suit", "2026-01-22"));
		shop.showPendingOrders();

		shop.addOrder(new Order(105, "Vikram Singh", "Wedding Suit", "2026-01-24"));
		shop.showPendingOrders();

		shop.addOrder(new Order(106, "Neha Jain", "Saree Blouse", "2026-01-23"));
		shop.showPendingOrders();

		System.out.println("All orders added. Shop is ready to prioritize earliest deadlines!");
	}
}