package com.day08.movietime;

public class Showtime {
	private String movieTitle;
	private String time; // "HH:MM" format
	private String screen;

	// constructor
	public Showtime(String movieTitle, String time, String screen) {
		this.movieTitle = movieTitle;
		this.time = time;
		this.screen = screen;
	}

	// good string representation
	public String toString() {
		return String.format("| %-8s | %-28s | %-8s |", time, movieTitle, screen);
	}

	// method to compare times for sorting
	public int compareTo(Showtime other) {
		return this.time.compareTo(other.time);
	}
}