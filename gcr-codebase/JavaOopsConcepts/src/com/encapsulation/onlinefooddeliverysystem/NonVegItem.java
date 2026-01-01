package com.encapsulation.onlinefooddeliverysystem;

public class NonVegItem extends FoodItem {

    private static final double EXTRA_CHARGE = 50;

    // Constructor to initialize non-veg item
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Total price calculation including extra charge
    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + EXTRA_CHARGE;
    }
}
