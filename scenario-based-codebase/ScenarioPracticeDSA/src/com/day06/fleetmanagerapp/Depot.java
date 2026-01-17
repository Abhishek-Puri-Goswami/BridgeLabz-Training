package com.day06.fleetmanagerapp;

public class Depot {
	private final String name;
	private final Vehicle[] vehicles; // pre-sorted lists

	// constructor with var-args
	public Depot(String name, Vehicle... vehicles) {
		this.name = name != null ? name.trim() : "Unnamed Depot";
		this.vehicles = vehicles != null ? vehicles : new Vehicle[0];
	}

	// constructor empty depot
	public Depot(String name) {
		this(name, new Vehicle[0]);
	}

	public String getName() {
		return name;
	}

	public Vehicle[] getVehicles() {
		return vehicles;
	}

	public int size() {
		return vehicles.length;
	}

	// good string representation
	@Override
	public String toString() {
		return name + " (" + size() + " vehicles)";
	}
}