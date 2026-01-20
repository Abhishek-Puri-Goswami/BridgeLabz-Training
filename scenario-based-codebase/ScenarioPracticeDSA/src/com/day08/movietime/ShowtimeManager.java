package com.day08.movietime;

import java.util.ArrayList;
import java.util.List;

public class ShowtimeManager {
	private List<Showtime> showtimes;

	// constructor
	public ShowtimeManager() {
		this.showtimes = new ArrayList<>();
	}

	// method for adding new showtime in sorted order
	public void addShowtime(Showtime newShow) {
		System.out.println("Added a show successfully.");
		if (showtimes.isEmpty()) {
			showtimes.add(newShow);
			return;
		}

		int i;
		for (i = 0; i < showtimes.size(); i++) {
			if (newShow.compareTo(showtimes.get(i)) <= 0) {
				break;
			}
		}

		showtimes.add(i, newShow);
	}

	// method for displaying all showtimes
	public void displaySchedule() {
		if (showtimes.isEmpty()) {
			System.out.println("No showtimes available today.");
			return;
		}

		System.out.println("------------------------------------------------------");
		System.out.println("| Time     | Movie                        | Screen   |");
		System.out.println("------------------------------------------------------");

		for (Showtime show : showtimes) {
			System.out.println(show);
		}

		System.out.println("------------------------------------------------------");
	}

	// method for getting number of shows
	public int getShowCount() {
		return showtimes.size();
	}
}