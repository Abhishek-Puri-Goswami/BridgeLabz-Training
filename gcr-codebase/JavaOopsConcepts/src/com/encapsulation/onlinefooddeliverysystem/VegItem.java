package com.encapsulation.onlinefooddeliverysystem;

public class VegItem extends FoodItem implements Discountable {

    // Constructor to initialize veg item
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Total price calculation for veg item
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    // Discount for veg items
    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10; // 10% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Discount @ 10%";
    }
}
