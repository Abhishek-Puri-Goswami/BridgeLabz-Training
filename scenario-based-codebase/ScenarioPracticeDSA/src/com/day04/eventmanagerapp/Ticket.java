package com.day04.eventmanagerapp;

public class Ticket implements Comparable<Ticket> {
	private final String eventName;
	// Section e.g., "VIP", "Gold", "Silver", "Economy"
	private final String section; 
	private final double price;
	private final int seatNumber;
	private final boolean available;

	// constructor
	public Ticket(String eventName, String section, double price, int seatNumber, boolean available) {
		this.eventName = eventName;
		this.section = section;
		this.price = price;
		this.seatNumber = seatNumber;
		this.available = available;
	}

	public double getPrice() {
		return price;
	}

	public boolean isAvailable() {
		return available;
	}

	// Method to make object comparison
	@Override
	public int compareTo(Ticket other) {
		// Sort by price ascending (cheapest first)
		return Double.compare(this.price, other.price);
	}

	// common string representation
	@Override
	public String toString() {
		return String.format("%-25s | %-10s | Rs.%,10.0f | Seat %4d | %s", eventName, section, price, seatNumber,
				available ? "Available" : "Sold");
	}
}