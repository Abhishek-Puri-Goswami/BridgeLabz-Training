package com.day07.foodloopapplication;

// Base class for food items
public abstract class FoodItem {

    protected String name;
    protected String category;
    protected double price;

    // availability for order
	private int stock;

	// constructor
    public FoodItem(String name, String category, double price, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    protected boolean reduceStock() {
        if (stock > 0) {
            stock--;
            return true;
        }
        return false;
    }

    public double getPrice() {
        return price;
    }

    public abstract String getType();
}
