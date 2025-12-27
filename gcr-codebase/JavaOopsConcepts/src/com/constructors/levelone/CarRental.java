package com.constructors.levelone;

public class CarRental {
	// Instance variables
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double ratePerDay = 1000;

    // Constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * ratePerDay;
    }

    // Method to display results
    public void display() {
        System.out.println("{ " + customerName + ", " + carModel +
                ", Total Cost: " + calculateTotalCost() + " }");
    }

    // main - driver method
    public static void main(String[] args) {
        CarRental rental = new CarRental("Amit", "Swift", 4);
        rental.display();
    }
}
