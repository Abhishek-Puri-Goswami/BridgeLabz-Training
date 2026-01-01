package com.encapsulation.ecommerceplatform;

import java.util.ArrayList;

public class ECommercePlatform {

	public static void main(String[] args) {

		ArrayList<Product> products = new ArrayList<>();

		products.add(new Electronics(201, "Laptop", 60000));
		products.add(new Clothing(202, "Jacket", 3000));
		products.add(new Groceries(203, "Rice Bag", 1200));

		// Polymorphism: processing different products using Product reference
		for (Product product : products) {

			product.displayDetails();

			double tax = 0;
			// check before down casting
			if (product instanceof Taxable) {
				Taxable taxable = (Taxable) product;
				tax = taxable.calculateTax();
				System.out.println("Tax Info   : " + taxable.getTaxDetails());
			}

			double discount = product.calculateDiscount();
			double finalPrice = product.getPrice() + tax - discount;

			System.out.println("Discount   : " + discount);
			System.out.println("Final Price: " + finalPrice);
			System.out.println("---------------------------");
		}
	}
}
