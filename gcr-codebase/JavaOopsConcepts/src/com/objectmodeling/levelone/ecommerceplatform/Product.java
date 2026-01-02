package com.objectmodeling.levelone;

public class Product {

    private String productName;
    private double price;

    // Constructor to initialize product
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    // Method to display product details
    public void displayProduct() {
        System.out.println("Product : " + productName);
        System.out.println("Price   : " + price);
    }

    // Method to get price of Order
    public double getPrice() {
        return price;
    }
}
