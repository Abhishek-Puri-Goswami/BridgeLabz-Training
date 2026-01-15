package com.day04.zipzipmartapp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SaleTransaction implements Comparable<SaleTransaction> {
	private final LocalDate date;
	private final double amount;
	private final String branch;
	private final String itemCategory;

	// constructor
	public SaleTransaction(LocalDate date, double amount, String branch, String itemCategory) {
		this.date = date;
		this.amount = amount;
		this.branch = branch;
		this.itemCategory = itemCategory;
	}

	public LocalDate getDate() {
		return date;
	}

	public double getAmount() {
		return amount;
	}

	// method to make object comparison possible
	@Override
	public int compareTo(SaleTransaction other) {
		// Primary sort: by date (asc)
		int dateCompare = this.date.compareTo(other.date);
		if (dateCompare != 0) {
			return dateCompare;
		}

		// Secondary sort: by amount (asc) if dates are equal
		return Double.compare(this.amount, other.amount);
	}

	// common string representation
	@Override
	public String toString() {
		return String.format("%s | Rs.%,10.2f | %-12s | %s", date.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")),
				amount, branch, itemCategory);
	}

	// Display summary
	public String getSummary() {
		return String.format("%s | Rs.%,8.02f | %s", date.format(DateTimeFormatter.ofPattern("dd-MMM")), amount, branch);
	}
}