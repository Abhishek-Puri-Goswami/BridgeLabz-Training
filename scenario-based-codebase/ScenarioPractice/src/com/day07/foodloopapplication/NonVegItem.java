package com.day07.foodloopapplication;

// Non-veg food item
public class NonVegItem extends FoodItem {

    public NonVegItem(String name, double price, int stock) {
        super(name, "Non-Veg", price, stock);
    }

    @Override
    public String getType() {
        return "Non-Veg";
    }
}
