package com.day04.fittrackapplication;

public class CardioWorkout extends Workout {

	// constructor
    public CardioWorkout(int duration) {
        super("Cardio", duration);
        calculateCalories();
    }

    // method to calculate calories burned
    @Override
    protected void calculateCalories() {
        caloriesBurned = duration * 8;
    }
}
