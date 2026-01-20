package com.day07.flashdealz;

import java.util.List;

public class QuickSortDiscount {

	// Quick Sort method
	public static void quickSort(List<Product> products, int low, int high) {
		if (low < high) {
			// find correct position of pivot
			int pi = partition(products, low, high);

			// sort left and right parts
			quickSort(products, low, pi - 1);
			quickSort(products, pi + 1, high);
		}
	}

	// Partition method - places pivot in correct position
	private static int partition(List<Product> products, int low, int high) {
		Product pivot = products.get(high);
		int i = low - 1;

		for (int j = low; j < high; j++) {
			// compare: higher discount comes first
			if (products.get(j).getDiscountPercentage() > pivot.getDiscountPercentage()) {
				i++;
				// swap
				Product temp = products.get(i);
				products.set(i, products.get(j));
				products.set(j, temp);
			}
		}

		// final swap for pivot
		Product temp = products.get(i + 1);
		products.set(i + 1, products.get(high));
		products.set(high, temp);

		return i + 1;
	}

	// simple method to sort whole list by discount (highest first)
	public static void sortByDiscountDescending(List<Product> products) {
		if (products == null || products.size() <= 1) {
			return;
		}
		quickSort(products, 0, products.size() - 1);
	}
}