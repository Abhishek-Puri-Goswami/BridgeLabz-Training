package com.constructors.levelone;

public class Vehicle {
	// Instance variables
	private String ownerName;
	private String vehicleType;

	// Class variable
	private static double registrationFee = 5000;

	// Initializes vehicle details
	public Vehicle(String ownerName, String vehicleType) {
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
	}

	// Displays vehicle details
	public void displayVehicleDetails() {
		System.out.println("Owner Name: " + ownerName);
		System.out.println("Vehicle Type: " + vehicleType);
		System.out.println("Registration Fee: " + registrationFee);
	}

	// Updates registration fee for all vehicles
	public static void updateRegistrationFee(double newFee) {
		registrationFee = newFee;
	}

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Rohit", "Car");
		Vehicle v2 = new Vehicle("Anita", "Bike");

		v1.displayVehicleDetails();
		v2.displayVehicleDetails();

		Vehicle.updateRegistrationFee(6000);

		v1.displayVehicleDetails();
		v2.displayVehicleDetails();
	}
}
