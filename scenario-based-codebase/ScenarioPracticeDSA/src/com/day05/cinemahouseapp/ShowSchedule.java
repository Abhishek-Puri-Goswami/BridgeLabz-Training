package com.day05.cinemahouseapp;

import java.time.LocalTime;
import java.util.ArrayList;

public class ShowSchedule {
	// List of MovieShows
	ArrayList<MovieShow> shows = new ArrayList<>();

	// method to add MovieShow to schedule
	public void addShow(MovieShow show) {
		shows.add(show);
		System.out.println("Added: " + show);
	}

	// Bubble Sort MovieShows by time in Schedule
 	public void sortByTime() {
		int n = shows.size();

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {

				LocalTime time1 = shows.get(j).getStartTime();
				LocalTime time2 = shows.get(j + 1).getStartTime();

				// If time1 is after time2 -> swap
				if (time1.isAfter(time2)) {
					MovieShow temp = shows.get(j);
					shows.set(j, shows.get(j + 1));
					shows.set(j + 1, temp);
				}
			}
		}

		System.out.println("\nMovie Shows sorted using Bubble Sort!");
	}

 	// method to print schedule
	public void printSchedule() {
		System.out.println("Today's schedule (" + shows.size() + " shows):");
		for (int i = 0; i < shows.size(); i++) {
			System.out.println("  " + (i + 1) + ") " + shows.get(i));
		}
		System.out.println("-----------------------------------");
	}
}
