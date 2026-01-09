package com.day07.foodloopapplication;

//Non-veg food item
public class VegItem extends FoodItem {

	// constructor
    public VegItem(String name, double price, int stock) {
        super(name, "Veg", price, stock);
    }

    @Override
    public String getType() {
        return "Veg";
    }
}
