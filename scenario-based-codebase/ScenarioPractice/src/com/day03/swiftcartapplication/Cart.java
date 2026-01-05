package com.day03.swiftcartapplication;

import java.util.ArrayList;

public class Cart implements ICheckout {

    private ArrayList<Product> products;
    private double totalPrice;

    // constructor for cart without pre-selected items
    public Cart() {
        products = new ArrayList<>();
        totalPrice = 0;
    }

    // constructor for cart with pre-selected items
    public Cart(ArrayList<Product> products) {
        this.products = products;
        calculateTotal();
    }

    // method to add product to cart
    public void addProduct(Product product, int quantity) {
        products.add(product);
        totalPrice += product.getPrice() * quantity;
    }

    // internal method to calculate total price
    private void calculateTotal() {
        totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
    }

    // method to apply discount on product price
    @Override
    public void applyDiscount() {
        if (products.isEmpty()) {
            return;
        }
        // discount based on product type
        Product product = products.get(0);
        double discount = product.getDiscount(totalPrice);
        totalPrice = totalPrice - discount;
        System.out.println("\nDiscount Applied : Rs. " + discount);
    }

    // method to display bill
    @Override
    public void generateBill() {
        System.out.println("\n----- SwiftCart Bill -----");
        for (Product product : products) {
            System.out.println(product.getName() + " - Rs. " + product.getPrice());
        }
        System.out.println("Total Amount : Rs. " + totalPrice);
    }
}
