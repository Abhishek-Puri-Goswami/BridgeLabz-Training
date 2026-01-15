package com.day09.payxpressapp;

import java.time.LocalDate;

public class ElectricityBill extends Bill {

	@SuppressWarnings("unused")
	private final int unitsConsumed;

	// constructor
	public ElectricityBill(int unitsConsumed, double ratePerUnit, LocalDate dueDate) {
		super("Electricity", unitsConsumed * ratePerUnit, dueDate);
		this.unitsConsumed = unitsConsumed;
	}

	@Override
	public void pay(double amountPaid) {
		double total = getTotalToPay();
		if (amountPaid >= total) {
			markAsPaid();
			System.out.printf("Electricity bill paid successfully. Change: Rs.%.2f%n", amountPaid - total);
		} else {
			System.out.println("Insufficient amount. Total due: Rs." + String.format("%.2f", total));
		}
	}

	@Override
	public void sendReminder() {
		System.out.println("REMINDER: Electricity bill due soon! Risk of power cut if not paid.");
	}
}