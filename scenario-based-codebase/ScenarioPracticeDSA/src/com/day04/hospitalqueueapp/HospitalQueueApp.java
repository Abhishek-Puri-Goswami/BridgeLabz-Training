/*
1. HospitalQueue – Patient Sorting by Criticality (Bubble Sort)
Story: 
	● At Apollo Hospital, patients in the ER are initially listed by arrival time. 
	● However, before assigning beds, the staff wants to sort them by criticality level (1–10). 
	● Since the list is usually small (10–20 patients), Bubble Sort is used to quickly sort 
	  patients in-place without using extra memory.
Key Concepts:
	● Bubble Sort for small datasets
	● In-place comparison
	● Swapping adjacent patient records
*/

package com.day04.hospitalqueueapp;

public class HospitalQueueApp {

	public static void main(String[] args) {

		HospitalQueue queue = new HospitalQueue();

		// Added patients arriving (FCFS)
		queue.addPatient(new Patient("Ramesh Kumar", 45, 4));
		queue.addPatient(new Patient("Priya Sharma", 28, 7));
		queue.addPatient(new Patient("Amit Singh", 62, 9));
		queue.addPatient(new Patient("Sunita Verma", 33, 3));
		queue.addPatient(new Patient("Vikram Patel", 19, 6));
		queue.addPatient(new Patient("Anjali Gupta", 55, 8));
		queue.addPatient(new Patient("Rajesh Yadav", 71, 10));
		queue.addPatient(new Patient("Neha Joshi", 24, 5));
		queue.addPatient(new Patient("Suresh Mehta", 39, 2));
		queue.addPatient(new Patient("Pooja Nair", 50, 9));

		// Show initial queue (arrival order)
		queue.displayQueue("Patients in Arrival Order (before sorting)");

		System.out.println("\nSorting patients by criticality (Bubble Sort)...");

		// Sort: highest criticality first
		queue.sortByCriticality();

		// Show final queue (treatment priority order)
		queue.displayQueue("Patients in Criticality Order (after sorting)");

		System.out.println("Total patients waiting: " + queue.getPatientCount());
		System.out.println("Most critical patient should be treated first.");
	}
}
