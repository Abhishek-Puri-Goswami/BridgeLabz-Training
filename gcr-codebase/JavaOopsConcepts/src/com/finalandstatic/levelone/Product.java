package com.finalandstatic.levelone;

public class Product {
    // Attributes
    private static int discount = 10;
    private String productName;
    private int price;
    private int quantity;
    private final int productID;
    // Constructor
    public Product(String productName, int price, int quantity, int productID) {
        // Resolving ambiguity using this keyword
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }
    // Static Method to update discount
    public static void updateDiscount(int newDiscount) {
        discount = newDiscount;
    }
    // Method to calculate total price after discount
    public double calculateTotalPrice() {
        double total = quantity * price;
        double discountAmount = total * (discount / 100.0);
        return total - discountAmount;
    }
    // Method to display the details
    public void displayDetails() {
        if(this instanceof Product) {
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Product ID: " + productID);
            System.out.println("Discount: " + discount);
            System.out.println("Total Price: " + calculateTotalPrice());
        } else {
            System.out.println("Invalid product object.");
        }
    }
    // Main method
    public static void main(String[] args) {
        // Create class objects
        Product item1 = new Product("Laptop", 50000, 2, 64613);
        Product item2 = new Product("Mobile", 15000, 5, 34644);
        // Call the display details method
        item1.displayDetails();
        item2.displayDetails();
        // Call the method to update the discount
        Product.updateDiscount(15);
        System.out.println("\nAfter updated discount: " + discount + "%");
        // Call the method after updating the discount
        item1.displayDetails();
        item2.displayDetails();
    }
}
