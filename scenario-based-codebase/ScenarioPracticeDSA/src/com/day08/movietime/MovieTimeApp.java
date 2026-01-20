/*
6. MovieTime – Theater Show Listings (Insertion Sort)
Story: 
	● A movie theater allows users to sort upcoming showtimes. 
	● Since shows are added throughout the day and the existing list is almost sorted, 
	  the app uses Insertion Sort to insert each new show in the correct time slot.
Concepts Involved:
	● Insertion Sort
	● Real-time insertion
	● Time-based ordering

*/
package com.day08.movietime;

public class MovieTimeApp {
	public static void main(String[] args) {
		ShowtimeManager manager = new ShowtimeManager();

		System.out.println("=====================================================");
		System.out.println("                MOVIE-TIME");
		System.out.println("=====================================================\n");

		manager.addShowtime(new Showtime("Dune: Part Two", "10:30", "Screen 2"));
		manager.displaySchedule();
		System.out.println();

		manager.addShowtime(new Showtime("Oppenheimer", "14:15", "IMAX"));
		manager.displaySchedule();
		System.out.println();

		manager.addShowtime(new Showtime("The Matrix", "09:00", "Screen 1"));
		manager.displaySchedule();
		System.out.println();

		manager.addShowtime(new Showtime("Interstellar", "18:45", "Screen 3"));
		manager.displaySchedule();

		System.out.println("\nTotal shows today: " + manager.getShowCount());
		System.out.println("=====================================================");
	}
}