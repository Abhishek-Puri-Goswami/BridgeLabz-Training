package com.day04.eventeaseapplication;

public abstract class Event implements ISchedulable {

	private final int eventId;
	protected String eventName;
	protected String location;
	protected String date;
	protected int attendees;

	private double totalCost;

	// constructor
	public Event(int eventId, String eventName, String location, String date, int attendees) {
		this.eventId = eventId;
		this.eventName = eventName;
		this.location = location;
		this.date = date;
		this.attendees = attendees;
	}

	// Calculates final cost internally
	protected void setCost(double venueCost, double serviceCost, double discount) {
		totalCost = venueCost + serviceCost - discount;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void printEvent() {
		System.out.printf("%-12d %-15s %-12s %-12s %-10d Rs.%-10.2f%n", eventId, eventName, location, date, attendees,
				totalCost);
	}
}
