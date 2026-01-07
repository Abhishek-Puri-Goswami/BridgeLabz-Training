package com.searching.algorithms;

import java.util.Arrays;

public class BinarySearchPeakElement {

	// Returns index of a peak element
	public static int findPeakElement(int[] arr) {

		int left = 0;
		int right = arr.length - 1;

		// Binary search
		while (left <= right) {

			int mid = left + (right - left) / 2;

			boolean leftOK = (mid == 0) || (arr[mid] > arr[mid - 1]);
			boolean rightOK = (mid == arr.length - 1) || (arr[mid] > arr[mid + 1]);

			// Check if mid is a peak
			if (leftOK && rightOK) {
				return mid;
			}

			// Move to left half
			if (mid > 0 && arr[mid] < arr[mid - 1]) {
				right = mid - 1;
			}
			// Move to right half
			else {
				left = mid + 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 3, 20, 4, 1, 0 };

		System.out.println("Array:");
		System.out.println(Arrays.toString(arr));

		int index = findPeakElement(arr);

		System.out.println("Peak element index: " + index);
		System.out.println("Peak element value: " + arr[index]);
	}
}
