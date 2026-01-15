/*
25. "PayXpress – Utility Bill Payment System"
Story: 
	● PayXpress enables users to pay utility bills (electricity, water, internet) with tracking and reminders.
Requirements:
	● Bill class: type, amount, dueDate, isPaid.
	● Interface IPayable with pay() and sendReminder().
	● Use constructors to create recurring bills.
	● Operators for calculating late fees: baseAmount + penalty.
	● Encapsulation: prevent direct payment status changes.
	● Inheritance: ElectricityBill, InternetBill, WaterBill.
	● Polymorphism: reminders vary depending on utility type.
	● Access Modifiers: payment details are internal only.
*/

package com.day09.payxpressapp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PayXpressApp {

	public static void main(String[] args) {

		List<IPayable> bills = new ArrayList<>();

		// Created some bills
		bills.add(new ElectricityBill(320, 7.5, LocalDate.now().minusDays(5)));
		bills.add(new WaterBill(1450.0, LocalDate.now().plusDays(3)));
		bills.add(new InternetBill("Unlimited 300Mbps", 1009.0, LocalDate.now().minusDays(2)));
		bills.add(new ElectricityBill(180, 7.5, LocalDate.now().plusDays(10)));

		System.out.println("========= PayXpress - Your Utility Bills =========");
		System.out.println();

		// Display all bills
		System.out.println("Current Bills:");
		for (IPayable b : bills) {
			System.out.println(b);
		}

		System.out.println();
		System.out.println("Sending reminders to all unpaid bills:");
		for (IPayable b : bills) {
			if (!((Bill) b).isPaid()) {
				b.sendReminder();
			}
		}

		System.out.println();
		System.out.println("Starting payments:");

		// Pay first bill
		System.out.println();
		System.out.println("Paying Electricity bill (late):");
		// Extra paid - gets change
		bills.get(0).pay(3000);

		// Pay water bill
		System.out.println();
		System.out.println("Paying Water bill:");
		bills.get(1).pay(1450);

		// Show updated status
		System.out.println();
		System.out.println("Updated Bills Status:");
		for (IPayable b : bills) {
			System.out.println(b);
		}

		System.out.println();
		System.out.println("\n====== Thank you for using PayXpress! =========");
	}
}
