package com.objectmodeling.levelone;

import java.util.Scanner;

public class ECommercePlatform {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter customer name: ");
		ECommerceCustomer customer = new ECommerceCustomer(input.nextLine());

		System.out.print("Enter order ID: ");
		int orderId = input.nextInt();

		Order order = new Order(orderId);

		System.out.print("Enter number of products: ");
		int count = input.nextInt();
		input.nextLine();

		// Loop to take product inputs
		for (int i = 1; i <= count; i++) {
			System.out.print("\nEnter product name: ");
			String productName = input.nextLine();

			System.out.print("Enter product price: ");
			double price = input.nextDouble();
			input.nextLine();

			Product product = new Product(productName, price);
			order.addProduct(product);
		}

		// Customer placed order
		customer.placeOrder(order);

		input.close();
	}
}
