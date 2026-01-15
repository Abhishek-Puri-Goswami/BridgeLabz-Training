package com.day09.payxpressapp;

import java.time.LocalDate;

public class InternetBill extends Bill {
	private final String planName;

	// constructor
	public InternetBill(String planName, double amount, LocalDate dueDate) {
		super("Internet", amount, dueDate);
		this.planName = planName;
	}

	@Override
	public void pay(double amountPaid) {
		double total = getTotalToPay();
		if (amountPaid >= total) {
			markAsPaid();
			System.out.println("Internet bill (" + planName + ") paid successfully.");
		} else {
			System.out.println("Partial payment. Internet speed may be restricted.");
		}
	}

	@Override
	public void sendReminder() {
		System.out.println("REMINDER: Internet bill due! Service may be paused after due date.");
	}
}