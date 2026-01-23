package com.day09.ecommerceproductinventory;

// Represents one product in the inventory
public class Product {
	// unique key
    private String sku;
    private String name;
    private double price;
    private int stock;

    // constructor
    public Product(String sku, String name, double price, int stock) {
        this.sku = sku;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // good string representation for display
    public String toString() {
        return String.format("%-12s | %-25s | ₹%8.2f | %5d",
                sku, name, price, stock);
    }

    // method to get SKU (unique key)
    public String getSku() {
        return sku;
    }

    // method to update price
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    // method to get price
    public double getPrice() {
        return price;
    }
}