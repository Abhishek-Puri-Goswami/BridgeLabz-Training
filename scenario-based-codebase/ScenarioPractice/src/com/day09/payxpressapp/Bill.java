package com.day09.payxpressapp;

import java.time.LocalDate;

public abstract class Bill implements IPayable {

	// "Electricity", "Water", "Internet"
	private final String type; 
	
	private double amount;
	private LocalDate dueDate;
	
	// protected from direct change
	private boolean isPaid = false; 

	// constructor
	public Bill(String type, double amount, LocalDate dueDate) {
		this.type = type;
		this.amount = amount;
		this.dueDate = dueDate;
	}

	// Only method to set payment status
	protected void markAsPaid() {
		this.isPaid = true;
	}

	public boolean isPaid() {
		return isPaid;
	}

	public double getAmount() {
		return amount;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public String getType() {
		return type;
	}

	// Late fee calculation
	protected double calculateLateFee() {
		if (LocalDate.now().isAfter(dueDate)) {
			// Penalty - 5%
			return amount * 0.05;
		}
		return 0.0;
	}

	// Total to pay (base + late fee)
	public double getTotalToPay() {
		return amount + calculateLateFee();
	}

	@Override
	public String toString() {
		return String.format("%-12s | Amount: Rs.%.2f | Due: %s | Paid: %-3s | Late Fee: Rs.%.2f", type, amount, dueDate,
				isPaid ? "Yes" : "No", calculateLateFee());
	}
}