package com.encapsulation.onlinefooddeliverysystem;

import java.util.ArrayList;

public class OnlineFoodDeliverySystem {

    public static void main(String[] args) {

        ArrayList<FoodItem> orderItems = new ArrayList<>();

        orderItems.add(new VegItem("Paneer Butter Masala", 250, 2));
        orderItems.add(new NonVegItem("Chicken Biryani", 320, 1));

        // Polymorphism: processing different food items uniformly
        for (FoodItem item : orderItems) {

            item.getItemDetails();

            if (item instanceof Discountable) {
                Discountable discountItem = (Discountable) item;
                System.out.println("Discount Info : " + discountItem.getDiscountDetails());
                System.out.println("Discount Amt  : " + discountItem.applyDiscount());
            }

            System.out.println("----------------------------");
        }
    }
}
