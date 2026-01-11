package com.day01.ambulancerouteapp;

//Circular Linked List to manage hospital units in a loop
public class HospitalCircularRoute {
	private HospitalUnit head;
	private HospitalUnit current; // last used/current pointer for rotation

	public HospitalCircularRoute() {
		head = null;
		current = null;
	}

	// Add a new hospital unit to the circular list
	public void addUnit(String name, boolean isAvailable) {
		HospitalUnit newUnit = new HospitalUnit(name, isAvailable);

		if (head == null) {
			head = newUnit;
			head.next = head; // point to itself (circular)
			current = head;
		} else {
			// Insert at the end
			HospitalUnit temp = head;
			while (temp.next != head) {
				temp = temp.next;
			}
			temp.next = newUnit;
			newUnit.next = head; // close the circle
		}
	}

	// Find the next available unit starting from current position
	public HospitalUnit findNextAvailableUnit() {
		if (head == null) {
			return null;
		}

		HospitalUnit start = current;
		HospitalUnit temp = current.next; // start checking from next one

		do {
			if (temp.isAvailable) {
				current = temp; // update current position
				return temp;
			}
			temp = temp.next;
		} while (temp != start); // full circle completed

		return null; // no available unit found
	}

	// Put unit under maintenance (make unavailable)
	public boolean setUnderMaintenance(String unitName) {
		if (head == null)
			return false;

		HospitalUnit temp = head;
		do {
			if (temp.name.equalsIgnoreCase(unitName)) {
				temp.isAvailable = false;
				return true;
			}
			temp = temp.next;
		} while (temp != head);

		return false;
	}

	// Restore unit from maintenance
	public boolean restoreUnit(String unitName) {
		if (head == null)
			return false;

		HospitalUnit temp = head;
		do {
			if (temp.name.equalsIgnoreCase(unitName)) {
				temp.isAvailable = true;
				return true;
			}
			temp = temp.next;
		} while (temp != head);

		return false;
	}

	// Print current route status (for debugging/simulation)
	public void printStatus() {
		if (head == null) {
			System.out.println("No units in hospital route!");
			return;
		}

		HospitalUnit temp = head;
		System.out.println("Hospital Circular Route Status:");
		do {
			System.out.printf("%-12s : %s%n", temp.name, temp.getStatus());
			temp = temp.next;
		} while (temp != head);
		System.out.println();
	}
}