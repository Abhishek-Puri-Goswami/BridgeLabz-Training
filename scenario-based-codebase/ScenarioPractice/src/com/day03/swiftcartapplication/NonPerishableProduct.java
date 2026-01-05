package com.day03.swiftcartapplication;

public class NonPerishableProduct extends Product {

	private double DISCOUNT = 0.05;
	
	// constructor
    public NonPerishableProduct(String name, double price) {
        super(name, price, "Non-Perishable");
    }

    // getter for discount
    @Override
    public double getDiscount(double totalPrice) {
        return totalPrice * DISCOUNT;
    }
}
