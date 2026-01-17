package com.day05.cinemahouseapp;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MovieShow {
	String movieName;
	LocalTime startTime;

	// constructor
	public MovieShow(String movieName, String timeString) {
		this.movieName = movieName;

		// Time format allowed : HH:mm
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
		this.startTime = LocalTime.parse(timeString, formatter);
	}

	// Good string representation
	@Override
	public String toString() {
		DateTimeFormatter display = DateTimeFormatter.ofPattern("HH:mm");
		return startTime.format(display) + " - " + movieName;
	}

	public LocalTime getStartTime() {
		return startTime;
	}
}