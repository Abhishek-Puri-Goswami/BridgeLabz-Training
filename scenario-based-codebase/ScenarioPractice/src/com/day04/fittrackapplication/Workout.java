package com.day04.fittrackapplication;

public abstract class Workout implements ITrackable {

	protected String type;
	protected int duration; // in minutes
	protected int caloriesBurned;

	// constructor
	public Workout(String type, int duration) {
		this.type = type;
		this.duration = duration;
	}

	// method to start workout
	@Override
	public void startWorkout() {
		System.out.println(type + " workout started...");
	}

	// method to stop workout
	@Override
	public void stopWorkout() {
		System.out.println(type + " workout completed.");
	}

	// method to be implemented by subclasses
	protected abstract void calculateCalories();

	// getter for caloriesBurned
	public int getCaloriesBurned() {
		return caloriesBurned;
	}

	// method to print workout details
	public void printWorkout() {
		System.out.println("\n------ Workout Details -----");
		System.out.printf("%-16s | %-16s | %-15s%n", "Type", "Duration(min)", "Calories");
		System.out.printf("%-16s | %-16d | %-15d%n", type, duration, caloriesBurned);
	}
}
