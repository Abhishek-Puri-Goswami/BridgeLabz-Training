package com.day06.fleetmanagerapp;

public class FleetManagerApp {
	public static void main(String[] args) {

		System.out.println("=========================== FLEETMANAGER ==============================\n");
		// Added example depots with pre-sorted vehicles list by mileage
		Depot[] depots = new Depot[] {
				new Depot("Indore", new Vehicle("MP09AB1234", "Tata Ace", 12450, "2025-11-10"),
						new Vehicle("MP09CD5678", "Mahindra Bolero", 18920, "2025-10-05"),
						new Vehicle("MP09EF9012", "Eicher Pro", 25670, "2025-12-01")),
				new Depot("Bhopal", new Vehicle("MP04GH3456", "Ashok Leyland", 9800, "2025-12-15"),
						new Vehicle("MP04IJ7890", "Tata Ultra", 14230, "2025-09-20"),
						new Vehicle("MP04KL2345", "Eicher Skyline", 20110, "2025-11-28"),
						new Vehicle("MP04MN6789", "Mahindra Furio", 27890, "2025-10-30")),
				new Depot("Jabalpur", new Vehicle("MP21OP1122", "Tata Prima", 16780, "2025-12-05"),
						new Vehicle("MP21QR3344", "BharatBenz", 22340, "2025-11-18")),
				new Depot("Gwalior") // empty
		};

		// Display depots
		printDepots(depots);

		// Vehicle[][] for the merge function
		Vehicle[][] lists = new Vehicle[depots.length][];
		for (int i = 0; i < depots.length; i++) {
			lists[i] = depots[i].getVehicles();
		}

		// Merge all lists
		Vehicle[] schedule = FleetMergeSort.mergeMultipleSortedLists(lists);

		// Display sorted schedule
		FleetMergeSort.printSchedule(schedule);
		System.out.println("======================= THANKS FOR VISITING ===========================\n");
	}

	private static void printDepots(Depot[] depots) {
		System.out.println("Pre-sorted lists from each depot:");
		System.out.println("-----------------------------------------------------------------------");

		for (Depot depot : depots) {
			System.out.printf("Depot: %s%n", depot);
			if (depot.size() == 0) {
				System.out.println("(empty)");
			} else {
				for (Vehicle v : depot.getVehicles()) {
					System.out.println(v);
				}
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------------------------------\n");
	}
}