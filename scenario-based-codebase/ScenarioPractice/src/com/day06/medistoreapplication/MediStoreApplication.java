/*
17. "MediStore – Pharmacy Inventory & Sales System"
Story: A pharmacy chain needs an app to manage drug inventory, sales, and expiry tracking.
Requirements:
● Medicine class: name, price, expiryDate, quantity.
● Interface ISellable with sell() and checkExpiry() methods.
● Constructors for medicines with default quantity.
● Use operators: total price, discount, stock adjustments.
● Encapsulation: internal stock and cost details are hidden.
● Inheritance: Tablet, Syrup, Injection extend Medicine.
● Polymorphism: checkExpiry() works differently for preserved vs liquid meds.
● Access Modifiers: make sensitive pricing logic private.
*/

package com.day06.medistoreapplication;

import java.util.Scanner;

public class MediStoreApplication {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Medicine Name: ");
		String name = input.nextLine();

		System.out.print("Enter Price (Rs.): ");
		double price = input.nextDouble();

		input.nextLine();
		System.out.print("Enter Expiry Date (yyyy-mm-dd): ");
		String expiry = input.nextLine();

		System.out.print("Enter Quantity: ");
		int qty = input.nextInt();

		System.out.println("Select Medicine Type:");
		System.out.println("1. Tablet");
		System.out.println("2. Syrup");
		System.out.println("3. Injection");
		System.out.print("Choice: ");
		int type = input.nextInt();

		Medicine medicine;
		if (type == 1) {
			medicine = new Tablet(name, price, expiry, qty);
		} else if (type == 2) {
			medicine = new Syrup(name, price, expiry, qty);
		} else {
			medicine = new Injection(name, price, expiry, qty);
		}

		input.nextLine();
		System.out.print("Enter Today's Date (yyyy-mm-dd): ");
		String today = input.nextLine();

		System.out.print("Enter Units to Sell: ");
		int units = input.nextInt();

		double amount = medicine.sell(units, today);

		System.out.println("\n--- Sale Summary ---");
		System.out.printf("%-15s : %s%n", "Medicine", name);
		System.out.printf("%-15s : %s%n", "Type", medicine.getType());
		System.out.printf("%-15s : %d%n", "Units ordered", units);
		System.out.printf("%-15s : %s%n", "Status", amount > 0 ? "Sold" : "Rejected (Expired/No Stock)");
		System.out.printf("%-15s : Rs.%.2f%n", "Final Amount", amount);
		System.out.printf("%-15s : %d%n", "Stock Left", medicine.getQuantity());
		input.close();
	}
}
