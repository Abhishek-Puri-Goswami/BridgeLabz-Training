package com.day03.swiftcartapplication;

import java.util.Scanner;

public class SwiftCartApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cart cart = new Cart();

        System.out.print("Enter number of products: ");
        int n = input.nextInt();
        input.nextLine();

        // Loop to add n products to cart
        for (int i = 1; i <= n; i++) {
            System.out.println("\nProduct " + i);
            System.out.print("Enter product name: ");
            String name = input.nextLine();

            System.out.print("Enter price: ");
            double price = input.nextDouble();

            System.out.print("Enter quantity: ");
            int qty = input.nextInt();

            System.out.println("Select Product Type:");
            System.out.println("1. Perishable");
            System.out.println("2. Non-Perishable");
            System.out.print("Choice: ");
            int type = input.nextInt();
            input.nextLine();

            Product product = null;
            if (type == 1) {
                product = new PerishableProduct(name, price);
            } else if(type == 2) {
                product = new NonPerishableProduct(name, price);
            } else {
            	System.err.println("Invalid Product Type!");
            	System.exit(0);
            }

            cart.addProduct(product, qty);
        }

        // Display results
        cart.applyDiscount();
        cart.generateBill();
        input.close();
    }
}
