package com.day07.foodloopapplication;

import java.util.Scanner;

public class FoodLoopApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Order order = new Order();

        System.out.print("Enter number of items: ");
        int n = input.nextInt();

        // Loop to add food items
        for (int i = 1; i <= n; i++) {

            System.out.println("\nItem " + i);
            System.out.print("Name: ");
            String name = input.next();

            System.out.print("Price (Rs.): ");
            double price = input.nextDouble();

            System.out.print("Stock: ");
            int stock = input.nextInt();

            System.out.println("Type: 1.Veg  2.Non-Veg");
            int type = input.nextInt();

            FoodItem item;
            if (type == 1) {
                item = new VegItem(name, price, stock);
            } else {
                item = new NonVegItem(name, price, stock);
            }

            order.addItem(item);
        }

        order.placeOrder();

        double total = order.getTotal();
        double discount = order.applyDiscount();
        double finalAmount = order.getFinalAmount();

        System.out.println("\n--- Bill Summary ---");
        System.out.printf("%-20s Rs.%-10.2f%n", "Total", total);
        System.out.printf("%-20s Rs.%-10.2f%n", "Discount", discount);
        System.out.printf("%-20s Rs.%-10.2f%n", "Final Amount", finalAmount);

        input.close();
    }
}
