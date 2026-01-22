package com.day09.medwarehouse;

public class MedWarehouseManager {

	// merge two already sorted arrays
	public Medicine[] merge(Medicine[] left, Medicine[] right) {
		Medicine[] result = new Medicine[left.length + right.length];

		int i = 0; // left pointer
		int j = 0; // right pointer
		int k = 0; // result pointer

		// merge while both lists have items
		while (i < left.length && j < right.length) {
			// earlier expiry comes first
			if (left[i].getExpiryDate().compareTo(right[j].getExpiryDate()) <= 0) {
				result[k] = left[i];
				i++;
			} else {
				result[k] = right[j];
				j++;
			}
			k++;
		}

		// copy remaining left items
		while (i < left.length) {
			result[k] = left[i];
			i++;
			k++;
		}

		// copy remaining right items
		while (j < right.length) {
			result[k] = right[j];
			j++;
			k++;
		}

		return result;
	}

	// recursive merge sort
	public Medicine[] mergeSort(Medicine[] arr) {
		if (arr.length <= 1) {
			return arr;
		}

		int mid = arr.length / 2;

		Medicine[] left = new Medicine[mid];
		Medicine[] right = new Medicine[arr.length - mid];

		// copy left half
		for (int i = 0; i < mid; i++) {
			left[i] = arr[i];
		}

		// copy right half
		for (int i = mid; i < arr.length; i++) {
			right[i - mid] = arr[i];
		}

		left = mergeSort(left);
		right = mergeSort(right);

		return merge(left, right);
	}

	// method to show all medicines sorted by expiry
	public void showInventory(Medicine[] medicines) {
		System.out.println("Medicine               | Batch        | Expiry     | Branch");
		System.out.println("---------------------------------------------------------------");

		for (Medicine m : medicines) {
			System.out.println(m);
		}

		System.out.println("---------------------------------------------------------------");
	}

	// method to alert about soon-to-expire medicines
	public void showExpiringSoon(Medicine[] medicines) {
		System.out.println("\n======= Medicines nearing expiry (within ~90 days) =========");
		System.out.println("Medicine               | Batch        | Expiry     | Branch");
		System.out.println("---------------------------------------------------------------");

		boolean hasExpiring = false;
		for (Medicine m : medicines) {
			if (m.isNearingExpiry()) {
				System.out.println(m);
				hasExpiring = true;
			}
		}

		if (!hasExpiring) {
			System.out.println("No medicines are nearing expiry.");
		}
		System.out.println("---------------------------------------------------------------");
	}
}