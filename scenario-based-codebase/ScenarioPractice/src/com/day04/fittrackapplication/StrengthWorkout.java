package com.day04.fittrackapplication;

public class StrengthWorkout extends Workout {

	// constructors
    public StrengthWorkout(int duration) {
        super("Strength", duration);
        calculateCalories();
    }

    // method to calculate calories burned in strength workout
    @Override
    protected void calculateCalories() {
        caloriesBurned = duration * 5;
    }
}
