/*
2. Vehicle Rental Application
Scenario: Build a system for renting bikes, cars, and trucks to customers.
Concepts Used:
● Class: Vehicle, Bike, Car, Truck, Customer

Scenario-based Problems
● Constructors: Custom constructors for different vehicle types
● Access Modifiers: protected for vehicle attributes to allow subclass access
● Interface: Rentable with method calculateRent(int days)
● Operators: Used in rent calculation (e.g., baseRate × days ± surcharges)
● OOP:
○ Abstraction: Rentable abstracts rental behavior
○ Inheritance: Car, Bike, Truck inherit from Vehicle
○ Polymorphism: Rent calculation differs by vehicle type
○ Encapsulation: All fields hidden behind getters/setters
*/

package com.day01.vehiclerentalapplication;

public class VehicleRentalApplication {

	public static void main(String[] args) {

		Customer customer = new Customer(1, "Abhishek Puri Goswami");

		Vehicle bike = new Bike("MP49-A0054");
		Vehicle car = new Car("MP49-A0154");
		Vehicle truck = new Truck("MP49-A0254");

		int days = 10;

		customer.displayCustomer();
		System.out.println("--------------");

		bike.displayDetails();
		System.out.println("Rent for " + days + " days : Rs." + bike.calculateRent(days));
		System.out.println("--------------");

		car.displayDetails();
		System.out.println("Rent for " + days + " days : Rs." + car.calculateRent(days));
		System.out.println("--------------");

		truck.displayDetails();
		System.out.println("Rent for " + days + " days : Rs." + truck.calculateRent(days));
	}
}
