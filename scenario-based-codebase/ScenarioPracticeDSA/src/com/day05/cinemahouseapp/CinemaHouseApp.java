/*
7. CinemaHouse – Movie Time Sorting (Bubble Sort)
Story: 
	● A small local cinema lists daily movie shows. 
	● The screen manager updates showtimes manually and prefers a simple sorting logic. 
	● Since the number of shows is small (~10), Bubble Sort is used.
Key Concepts:
	● Manual data entry, simple logic
	● Small dataset
	● Minimal code complexity
*/

package com.day05.cinemahouseapp;

public class CinemaHouseApp {
	public static void main(String[] args) {
		System.out.println("================= CinemaHouse =================\n");

		ShowSchedule schedule = new ShowSchedule();

		// Added example movie shows
		schedule.addShow(new MovieShow("Dangal", "09:30"));
		schedule.addShow(new MovieShow("Sultan", "14:15"));
		schedule.addShow(new MovieShow("KGF 2", "18:45"));
		schedule.addShow(new MovieShow("Avengers Endgame", "11:00"));
		schedule.addShow(new MovieShow("Salaar 2", "16:30"));
		schedule.addShow(new MovieShow("Saiyaara", "12:45"));

		System.out.println("\nBefore sorting:");
		schedule.printSchedule();

		schedule.sortByTime();

		System.out.println("\nAfter sorting:");
		schedule.printSchedule();

		System.out.println("=============== Enjoy the Show ==============");
	}
}