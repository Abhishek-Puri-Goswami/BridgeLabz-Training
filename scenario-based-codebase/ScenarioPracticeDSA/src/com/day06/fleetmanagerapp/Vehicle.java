package com.day06.fleetmanagerapp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Vehicle implements Comparable<Vehicle> {

	private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd-MMM-yyyy");

	private final LocalDate lastServiceDate;
	private final String registrationNumber;
	private final String model;
	private final int mileage; // in km

	public Vehicle(String registrationNumber, String model, int mileage, String lastServiceDateStr) {
		this.registrationNumber = registrationNumber.trim();
		this.model = model.trim();
		this.mileage = mileage;
		this.lastServiceDate = LocalDate.parse(lastServiceDateStr.trim());
	}

	public int getMileage() {
		return mileage;
	}

	public LocalDate getLastServiceDate() {
		return lastServiceDate;
	}

	// method to compare vehicles by mileage
	@Override
	public int compareTo(Vehicle other) {
		return Integer.compare(this.mileage, other.mileage);
	}

	// good string representation
	@Override
	public String toString() {
		return String.format("%-12s | %-15s | %6d km | Last service: %s", registrationNumber, model, mileage,
				lastServiceDate.format(DATE_FORMATTER));
	}
}