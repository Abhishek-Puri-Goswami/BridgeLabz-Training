package com.day03.swiftcartapplication;

public abstract class Product {

    protected String name;
    protected double price;
    protected String category;

    // constructor
    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // getter for product name
    public String getName() {
        return name;
    }

    // getter for product price
    public double getPrice() {
        return price;
    }

    // method for discount for product types
    public abstract double getDiscount(double totalPrice);
}
