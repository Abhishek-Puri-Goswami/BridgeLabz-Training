package com.day08.foodfest;

public class FoodFestManager {

	// method for merging two already sorted arrays
	public StallFootfall[] merge(StallFootfall[] left, StallFootfall[] right) {
		StallFootfall[] result = new StallFootfall[left.length + right.length];

		int i = 0; // pointer for left array
		int j = 0; // pointer for right array
		int k = 0; // pointer for result array

		// compare and merge while both arrays have elements
		while (i < left.length && j < right.length) {
			// higher footfall comes first (descending order)
			if (left[i].getFootfallCount() >= right[j].getFootfallCount()) {
				result[k] = left[i];
				i++;
			} else {
				result[k] = right[j];
				j++;
			}
			k++;
		}

		// copy remaining elements from left (if any)
		while (i < left.length) {
			result[k] = left[i];
			i++;
			k++;
		}

		// copy remaining elements from right (if any)
		while (j < right.length) {
			result[k] = right[j];
			j++;
			k++;
		}

		return result;
	}

	// method for merge sort - recursively divide and merge
	public StallFootfall[] mergeSort(StallFootfall[] arr) {
		// base case: array with 0 or 1 element is already sorted
		if (arr.length <= 1) {
			return arr;
		}

		// split array into two halves
		int mid = arr.length / 2;

		StallFootfall[] left = new StallFootfall[mid];
		StallFootfall[] right = new StallFootfall[arr.length - mid];

		// copy left half
		for (int i = 0; i < mid; i++) {
			left[i] = arr[i];
		}

		// copy right half
		for (int i = mid; i < arr.length; i++) {
			right[i - mid] = arr[i];
		}

		// sort both halves recursively
		left = mergeSort(left);
		right = mergeSort(right);

		// merge sorted halves
		return merge(left, right);
	}

	// method for displaying the sorted list
	public void printTopStalls(StallFootfall[] stalls) {
		System.out.println("--------------------------------------------------");
		System.out.println("Rank | Stall Name             | Footfall | Zone");
		System.out.println("--------------------------------------------------");

		for (int i = 0; i < stalls.length; i++) {
			System.out.printf("%-4d | %s\n", (i + 1), stalls[i]);
		}
		System.out.println("--------------------------------------------------");
	}
}