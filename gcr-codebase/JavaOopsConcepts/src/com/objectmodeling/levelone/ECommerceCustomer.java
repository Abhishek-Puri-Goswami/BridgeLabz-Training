package com.objectmodeling.levelone;

public class ECommerceCustomer {

    private String customerName;

    // Constructor to initialize customer
    public ECommerceCustomer(String customerName) {
        this.customerName = customerName;
    }

    // Method for customer to place an order
    public void placeOrder(Order order) {
        System.out.println("\nCustomer " + customerName + " placed an order.");
        order.displayOrder();
    }
}
