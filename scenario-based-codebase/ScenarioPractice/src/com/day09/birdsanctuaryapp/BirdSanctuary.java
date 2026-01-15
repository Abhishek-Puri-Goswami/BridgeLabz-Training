package com.day09.birdsanctuaryapp;

import java.util.ArrayList;
import java.util.List;

public class BirdSanctuary {

	private final List<Bird> birds = new ArrayList<>();
	private int nextId = 1001;

	public void addBird(Bird bird) {
		birds.add(bird);
		System.out.println("Added bird: " + bird);
	}

	public Bird findBirdById(int id) {
		for (Bird b : birds) {
			if (b.getId() == id) {
				return b;
			}
		}
		return null;
	}

	public boolean removeBirdById(int id) {
		Bird bird = findBirdById(id);
		if (bird != null) {
			birds.remove(bird);
			System.out.println("Removed bird ID " + id + " (" + bird.getName() + ")");
			return true;
		}
		System.out.println("Bird with ID " + id + " not found.");
		return false;
	}

	public void displayAllBirds() {
		if (birds.isEmpty()) {
			System.out.println("No birds in the sanctuary yet.");
			return;
		}
		System.out.println("\nAll Birds in Sanctuary:");
		for (Bird b : birds) {
			System.out.println(b);
		}
		System.out.println();
	}

	public void displayFlyingBirds() {
		System.out.println("\nFlying Birds:");
		boolean found = false;
		for (Bird b : birds) {
			if (b instanceof Flyable) {
				System.out.println(b);
				found = true;
			}
		}
		if (!found) {
			System.out.println("(none)");
		}
		System.out.println();
	}

	public void displaySwimmingBirds() {
		System.out.println("\nSwimming Birds:");
		boolean found = false;
		for (Bird b : birds) {
			if (b instanceof Swimmable) {
				System.out.println(b);
				found = true;
			}
		}
		if (!found) {
			System.out.println("(none)");
		}
		System.out.println();
	}

	public void displayBothAbilitiesBirds() {
		System.out.println("\nBirds that can both Fly and Swim:");
		boolean found = false;
		for (Bird b : birds) {
			if (b instanceof Flyable && b instanceof Swimmable) {
				System.out.println(b);
				found = true;
			}
		}
		if (!found) {
			System.out.println("(none)");
		}
		System.out.println();
	}

	public void generateReport() {
		int flyable = 0;
		int swimmable = 0;
		int both = 0;
		int neither = 0;

		for (Bird b : birds) {
			boolean canFly = (b instanceof Flyable);
			boolean canSwim = (b instanceof Swimmable);

			if (canFly && canSwim) {
				both++;
			} else if (canFly) {
				flyable++;
			} else if (canSwim) {
				swimmable++;
			} else {
				neither++;
			}
		}

		System.out.println("\n=== Sanctuary Ability Report ===");
		System.out.println("Total birds       : " + birds.size());
		System.out.println("Only Flyable      : " + flyable);
		System.out.println("Only Swimmable    : " + swimmable);
		System.out.println("Both abilities    : " + both);
		System.out.println("Neither ability   : " + neither);
		System.out.println("==============================\n");
	}

	public void simulateFlightSession() {
		System.out.println("\nFlight Session:");
		for (Bird b : birds) {
			if (b instanceof Flyable) {
				((Flyable) b).fly();
			}
		}
		System.out.println();
	}

	public int getNextId() {
		return nextId;
	}
}