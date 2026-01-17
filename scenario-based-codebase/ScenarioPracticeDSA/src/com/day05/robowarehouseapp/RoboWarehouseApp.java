/*
6. RoboWarehouse – Shelf Loading Robot (Insertion Sort)
Story: 
	● A robot loads packages onto shelves based on weight. 
	● It adds one package at a time and must maintain an ascending order by weight for balance. 
	● Insertion Sort helps since new items are inserted into the sorted list dynamically.
Key Concepts:
	● Insertion into sorted lists
	● Low memory footprint
	● Ideal for streaming insertions
*/

package com.day05.robowarehouseapp;

public class RoboWarehouseApp {
	public static void main(String[] args) {
		System.out.println("============ RoboWarehouse ==============\n");

		Shelf shelf = new Shelf();

		// Added example packages 
		String[] ids = { "P001", "P002", "P003", "P004", "P005", "P006", "P007" };
		double[] weights = { 12.5, 4.2, 9.8, 15.0, 6.1, 11.3, 3.9 };

		for (int i = 0; i < ids.length; i++) {
			if (weights[i] > 0) {
				Package newPackage = new Package(ids[i], weights[i]);
				System.out.println(">> New package arrived: " + newPackage);

				shelf.addPackage(newPackage);
				shelf.printShelf();
			}
		}

		System.out.println("\n========= Finished Loading Packages ==============");
	}
}