package com.day07.fitnesstracker;

import java.util.List;

public class BubbleSortLeaderboard {

	// Bubble Sort - highest steps first
	public static void sortByStepsDescending(List<UserSteps> users) {
		int n = users.size();

		// loop for (n - 1) passes
		for (int i = 0; i < n - 1; i++) {
			boolean swapped = false;

			// compare adjacent elements
			for (int j = 0; j < n - 1 - i; j++) {
				// if left has LESS steps than right -> swap
				if (users.get(j).getSteps() < users.get(j + 1).getSteps()) {
					// swap
					UserSteps temp = users.get(j);
					users.set(j, users.get(j + 1));
					users.set(j + 1, temp);
					swapped = true;
				}
			}

			// if no swap happened in this pass -> already sorted
			if (!swapped) {
				break;
			}
		}
	}
}