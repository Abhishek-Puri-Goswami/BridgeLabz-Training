package com.day06.icecreamrushapp;

public class BubbleSort {
	// Sorts flavors in descending order of sales
	public static void bubbleSort(IceCreamFlavor[] flavors) {
		int n = flavors.length;
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (flavors[j].compareTo(flavors[j + 1]) < 0) {
					IceCreamFlavor temp = flavors[j];
					flavors[j] = flavors[j + 1];
					flavors[j + 1] = temp;
				}
			}
		}
	}

	// method to print popularity
	public static void printPopularity(IceCreamFlavor[] flavors, String title) {
		System.out.println(title + ":");
		System.out.println("==============================================");
		System.out.println("Rank | Flavor              | Weekly Sales");
		System.out.println("----------------------------------------------");

		for (int rank = 1; rank <= flavors.length; rank++) {
			IceCreamFlavor f = flavors[rank - 1];
			System.out.printf("%2d.  | %-19s | %5d%n", rank, f.getName(), f.getWeeklySales());
		}
		System.out.println("==============================================\n");
	}
}