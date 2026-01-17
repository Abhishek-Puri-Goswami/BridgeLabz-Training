package com.day05.robowarehouseapp;

import java.util.ArrayList;

public class Shelf {
	ArrayList<Package> packages = new ArrayList<>();

	// method to add package to shelf
	public void addPackage(Package p) {

		// For correct index position (insertion sort)
		int i = 0;
		while (i < packages.size() && packages.get(i).getWeight() < p.getWeight()) {
			i++;
		}

		// placed package there
		packages.add(i, p);

		System.out.println(">> Robot placed: " + p + "  at position " + (i + 1));
	}

	// method to print shelf details
	public void printShelf() {
		System.out.println(">> Shelf now has " + packages.size() + " packages:");
		for (int i = 0; i < packages.size(); i++) {
			Package pkg = packages.get(i);
			System.out.println("  " + (i + 1) + ". " + pkg);
		}
		System.out.println("-----------------------------");
	}
}