package com.hashmaps.longestconsecutivesequence;

import java.util.HashSet;

public class LongestConsecutiveSequence {

	// Finds length of longest consecutive sequence
	public static int longestSequence(int[] arr) {

		HashSet<Integer> set = new HashSet<>();

		// Store all elements in set
		for (int num : arr) {
			set.add(num);
		}

		int longest = 0;

		// Traverse array
		for (int num : arr) {

			// Start counting only if it's the beginning
			if (!set.contains(num - 1)) {

				int currentNum = num;
				int count = 1;

				// Count consecutive numbers
				while (set.contains(currentNum + 1)) {
					currentNum++;
					count++;
				}

				longest = Math.max(longest, count);
			}
		}

		return longest;
	}

	public static void main(String[] args) {

		int[] arr = { 100, 4, 200, 1, 3, 2 };

		System.out.println("Longest Consecutive Sequence Length: " + longestSequence(arr));
	}
}
