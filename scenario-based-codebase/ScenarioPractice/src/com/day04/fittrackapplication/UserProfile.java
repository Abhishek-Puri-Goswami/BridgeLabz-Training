package com.day04.fittrackapplication;

public class UserProfile {

    private String name;
    private int age;
    private double weight;
    private int dailyTarget;

    // constructor with default goal
    public UserProfile(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.dailyTarget = 500;
    }

    // constructor with custom goal
    public UserProfile(String name, int age, double weight, int dailyTarget) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.dailyTarget = dailyTarget;
    }

    public int getDailyTarget() {
        return dailyTarget;
    }

    public void printProfile() {
        System.out.println("\n------ User Profile ------");
        System.out.printf("%-16s | %s%n", "Name", name);
        System.out.printf("%-16s | %d%n", "Age", age);
        System.out.printf("%-16s | %.1f kg%n", "Weight", weight);
        System.out.printf("%-16s | %d kcal%n", "Daily Target", dailyTarget);
    }
}
