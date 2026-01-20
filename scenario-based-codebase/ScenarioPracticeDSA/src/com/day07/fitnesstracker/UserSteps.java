package com.day07.fitnesstracker;

public class UserSteps {
	private String username;
	private int steps;

	// constructor
	public UserSteps(String username, int steps) {
		this.username = username;
		this.steps = steps;
	}

	public int getSteps() {
		return steps;
	}

	// good string representation
	@Override
	public String toString() {
		return String.format("%-18s | %6d steps", username, steps);
	}
}