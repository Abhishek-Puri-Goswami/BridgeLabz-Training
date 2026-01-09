package com.day07.skillforgeapplication;

public class Course {

    private String title;
    private Instructor instructor;
    private String[] modules;

    private double rating;
    
    // Constructor with default modules
    public Course(String title, Instructor instructor) {
        this(title, instructor, new String[]{"Introduction", "Basics", "Intermediate", "Advanced"});
    }

    // Constructor with custom modules
    public Course(String title, Instructor instructor, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.rating = 4.0;
    }

    protected void updateRating(double newRating) {
        rating = (rating + newRating) / 2;
    }

    public double getRating() {
        return rating;
    }

    public void printCourse() {
        System.out.printf("%-15s %-15s %-10.2f%n", title, instructor.name, rating);
    }

    public int getTotalModules() {
        return modules.length;
    }
}
