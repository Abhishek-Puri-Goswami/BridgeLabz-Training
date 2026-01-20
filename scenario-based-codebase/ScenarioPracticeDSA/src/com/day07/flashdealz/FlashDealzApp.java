/*
 4. FlashDealz – Product Sorting by Discount (Quick Sort)
Story: 
	● An e-commerce platform runs a flash sale with millions of products, each offering different discounts. 
	● Users want to see the top discounted products instantly. 
	● To quickly sort such large data, the backend uses Quick Sort, 
	  known for its fast average-case performance and efficiency.
Concepts Involved:
	● Quick Sort
	● Large unsorted data
	● Performance optimization
*/

package com.day07.flashdealz;

import java.util.ArrayList;
import java.util.List;

public class FlashDealzApp {
	public static void main(String[] args) {
		// sample example products
		List<Product> flashSaleProducts = new ArrayList<>();

		flashSaleProducts.add(new Product("Wireless Earbuds", 2499, 999));
		flashSaleProducts.add(new Product("Smartwatch 2.0", 5999, 3499));
		flashSaleProducts.add(new Product("Bluetooth Speaker", 1999, 799));
		flashSaleProducts.add(new Product("4K Action Camera", 8999, 4999));
		flashSaleProducts.add(new Product("Gaming Mouse", 1499, 899));
		flashSaleProducts.add(new Product("Phone Back Cover", 599, 149));
		flashSaleProducts.add(new Product("LED Strip Lights", 1299, 499));
		flashSaleProducts.add(new Product("Mini Projector", 12999, 7999));

		System.out.println("Before sorting (random order):");
		System.out.println("----------------------------------------------------------");
		for (Product p : flashSaleProducts) {
			System.out.println(p);
		}

		System.out.println("\nSorting by highest discount first...");
		QuickSortDiscount.sortByDiscountDescending(flashSaleProducts);

		System.out.println("\nTop Flash Deals (Highest Discount First):");
		System.out.println("----------------------------------------------------------");
		for (int i = 0; i < flashSaleProducts.size(); i++) {
			System.out.printf("%2d. %s%n", i + 1, flashSaleProducts.get(i));
		}

		System.out.println("\nNote: Quick Sort works very fast for large lists (average case)");
	}
}