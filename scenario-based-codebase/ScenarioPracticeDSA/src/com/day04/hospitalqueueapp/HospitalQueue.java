package com.day04.hospitalqueueapp;

import java.util.ArrayList;
import java.util.List;

public class HospitalQueue {

	private List<Patient> patients;

	// constructor
	public HospitalQueue() {
		patients = new ArrayList<>();
	}

	public void addPatient(Patient p) {
		patients.add(p);
	}

	// Bubble Sort: sort by criticality (DESC - highest first)
	public void sortByCriticality() {
		int n = patients.size();

		// number of passes
		for (int i = 0; i < n - 1; i++) {
			boolean swapped = false;

			// compare adjacent elements
			for (int j = 0; j < n - 1 - i; j++) {
				Patient current = patients.get(j);
				Patient next = patients.get(j + 1);

				// If current patient is LESS critical than next => swap
				if (current.getCriticality() < next.getCriticality()) {
					// Swap
					patients.set(j, next);
					patients.set(j + 1, current);
					swapped = true;
				}
			}

			// If no swaps happened in this pass => list is sorted
			if (!swapped) {
				break;
			}
		}
	}

	// display patients waiting line
	public void displayQueue(String title) {
		System.out.println("\n" + title);
		System.out.println("--------------------------------------------------");
		if (patients.isEmpty()) {
			System.out.println("No patients waiting.");
			return;
		}

		int position = 1;
		for (Patient p : patients) {
			System.out.printf("%2d. %s%n", position++, p);
		}
		System.out.println("--------------------------------------------------");
	}

	public int getPatientCount() {
		return patients.size();
	}
}