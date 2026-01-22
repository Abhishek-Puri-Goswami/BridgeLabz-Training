package com.day09.tailorshop;

public class Order {
	private String customerName;
	private String garmentType;
	private String deadline; // format: "YYYY-MM-DD"
	private int orderId;

	// constructor
	public Order(int orderId, String customerName, String garmentType, String deadline) {
		this.orderId = orderId;
		this.customerName = customerName;
		this.garmentType = garmentType;
		this.deadline = deadline;
	}

	// good string representation
	public String toString() {
		return String.format("%-6d | %-15s | %-18s | %s", orderId, customerName, garmentType, deadline);
	}

	// method to get deadline
	public String getDeadline() {
		return deadline;
	}

	// method to get order id
	public int getOrderId() {
		return orderId;
	}
}