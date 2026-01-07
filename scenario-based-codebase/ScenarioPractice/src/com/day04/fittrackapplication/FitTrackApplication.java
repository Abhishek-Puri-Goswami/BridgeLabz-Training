/*
11. "FitTrack – Your Personal Fitness Tracker"
Story: You’ve been hired to develop FitTrack, a fitness tracking app that monitors users'
workouts, calories, and daily progress.
Requirements:
● UserProfile class with fields like name, age, weight, goal.
● Workout class to track type, duration, caloriesBurned.
● Constructors to allow user creation with default or custom goals.
● ITrackable interface with startWorkout() and stopWorkout() methods.
● Use encapsulation to protect private health data (e.g., weight).
● Operators to compute calorie targets and progress (dailyTarget -
caloriesBurned).
● Inheritance: CardioWorkout, StrengthWorkout extend Workout.
● Polymorphism: calculateCalories() differs by workout type.
● Access modifiers to restrict internal workout logs from being exposed directly.
*/

package com.day04.fittrackapplication;

import java.util.Scanner;

public class FitTrackApplication {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// User input
		System.out.print("Enter Name: ");
		String name = input.nextLine();

		System.out.print("Enter Age: ");
		int age = input.nextInt();

		System.out.print("Enter Weight (kg): ");
		double weight = input.nextDouble();

		System.out.print("Enter Daily Calorie goal: ");
		int goal = input.nextInt();

		UserProfile user = new UserProfile(name, age, weight, goal);

		// Workout choice
		System.out.println("\nSelect Workout Type:");
		System.out.println("1. Cardio");
		System.out.println("2. Strength");
		System.out.print("Choice: ");
		int choice = input.nextInt();

		System.out.print("Enter Workout Duration (minutes): ");
		int duration = input.nextInt();

		Workout workout = null;
		if (choice == 1) {
			workout = new CardioWorkout(duration);
		} else if (choice == 2) {
			workout = new StrengthWorkout(duration);
		} else {
			System.err.println("Invalid Workout Choice! Please provide valid choice.");
			System.exit(0);
		}

		workout.startWorkout();
		workout.stopWorkout();

		int burnedCalories = workout.getCaloriesBurned();
		int remainingCalories = goal - burnedCalories;

		// Display the results
		user.printProfile();

		workout.printWorkout();

		System.out.println("\n------ Daily Progress ------");
		System.out.printf("%-16s | %d kcal%n", "Calories Burned", burnedCalories);
		System.out.printf("%-16s | %d kcal%n", "Remaining Target", (remainingCalories < 0? 0 : remainingCalories));
		input.close();
	}
}
