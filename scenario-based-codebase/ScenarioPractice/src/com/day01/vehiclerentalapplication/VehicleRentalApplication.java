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
