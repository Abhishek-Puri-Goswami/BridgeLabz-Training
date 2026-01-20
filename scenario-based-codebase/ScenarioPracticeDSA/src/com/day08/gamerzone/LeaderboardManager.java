package com.day08.gamerzone;

public class LeaderboardManager {

	// method for swapping two players in array
	private void swap(Player[] players, int i, int j) {
		Player temp = players[i];
		players[i] = players[j];
		players[j] = temp;
	}

	// method to choose pivot and place it in correct position
	private int partition(Player[] players, int low, int high) {
		// Choose last element as pivot
		Player pivot = players[high];
		int i = low - 1; // index of smaller element

		for (int j = low; j < high; j++) {
			// higher score comes first (descending order)
			if (players[j].getScore() > pivot.getScore()) {
				i++;
				swap(players, i, j);
			}
		}

		// place pivot in correct position
		swap(players, i + 1, high);
		return i + 1; // return pivot position
	}

	// Quick Sort
	private void quickSort(Player[] players, int low, int high) {
		if (low < high) {
			// find pivot position
			int pi = partition(players, low, high);

			// sort elements before and after partition
			quickSort(players, low, pi - 1);
			quickSort(players, pi + 1, high);
		}
	}

	// public method to sort the leaderboard
	public void sortLeaderboard(Player[] players) {
		if (players == null || players.length <= 1) {
			return;
		}
		quickSort(players, 0, players.length - 1);
	}

	// method for displaying top players
	public void showTopPlayers(Player[] players, int topN) {
		System.out.println("Rank | Username           |   Score  | Region");
		System.out.println("---------------------------------------------");

		int limit = Math.min(topN, players.length);

		for (int i = 0; i < limit; i++) {
			System.out.printf("%-4d | %s\n", (i + 1), players[i]);
		}
	}
}