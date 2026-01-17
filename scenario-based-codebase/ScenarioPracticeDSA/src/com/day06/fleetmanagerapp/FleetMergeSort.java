package com.day06.fleetmanagerapp;

public class FleetMergeSort {
	// method merges all depot lists into a single sorted array
	public static Vehicle[] mergeMultipleSortedLists(Vehicle[][] depotLists) {
		if (depotLists == null || depotLists.length == 0) {
			return new Vehicle[0];
		}
		return mergeSortLists(depotLists, 0, depotLists.length - 1);
	}

	// method recursively divides depot lists and merges results
	private static Vehicle[] mergeSortLists(Vehicle[][] lists, int start, int end) {
		if (start == end) {
			return lists[start]; // single list - already sorted
		}

		int mid = start + (end - start) / 2;
		Vehicle[] left = mergeSortLists(lists, start, mid);
		Vehicle[] right = mergeSortLists(lists, mid + 1, end);

		return mergeTwoSortedArrays(left, right);
	}

	// Method merges two sorted arrays into one sorted array
	private static Vehicle[] mergeTwoSortedArrays(Vehicle[] a, Vehicle[] b) {
		Vehicle[] result = new Vehicle[a.length + b.length];
		int i = 0, j = 0, k = 0;

		while (i < a.length && j < b.length) {
			if (a[i].compareTo(b[j]) <= 0) {
				result[k++] = a[i++];
			} else {
				result[k++] = b[j++];
			}
		}

		// Copy remaining elements from left array
		while (i < a.length)
			result[k++] = a[i++];
		// Copy remaining elements from right array
		while (j < b.length)
			result[k++] = b[j++];

		return result;
	}

	// Method prints sorted maintenance schedule
	public static void printSchedule(Vehicle[] vehicles) {
		if (vehicles.length == 0) {
			System.out.println(">> No vehicles in schedule.");
			return;
		}

		System.out.println("============= Maintenance Schedule (sorted by mileage) ================");
		System.out.println("Reg.No.      | Model           | Mileage   | Last Service");
		System.out.println("=======================================================================");

		for (Vehicle v : vehicles) {
			System.out.println(v);
		}

		System.out.println("=======================================================================\n");
		System.out.printf(">> Total vehicles scheduled: %d%n%n", vehicles.length);
	}
}