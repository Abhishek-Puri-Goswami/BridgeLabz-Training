package com.day03.swiftcartapplication;

public class PerishableProduct extends Product {
    private double DISCOUNT = 0.10;
	
    // constructor
    public PerishableProduct(String name, double price) {
        super(name, price, "Perishable");
    }

    // getter for discount
    @Override
    public double getDiscount(double totalPrice) {
        return totalPrice * DISCOUNT;
    }
}
