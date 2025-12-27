package com.constructors.levelone;

public class Course {
	// Instance variables
	private String courseName;
	private int duration;
	private double fee;

	// Class variable
	private static String instituteName = "MyInstitute";

	// Initializes course details
	public Course(String courseName, int duration, double fee) {
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
	}

	// Displays course details
	public void displayCourseDetails() {
		System.out.println("Institute: " + instituteName);
		System.out.println("Course: " + courseName);
		System.out.println("Duration: " + duration + " days");
		System.out.println("Fee: " + fee);
	}

	// Updates institute name for all courses
	public static void updateInstituteName(String newName) {
		instituteName = newName;
	}

	// main - driver method
	public static void main(String[] args) {
		Course c1 = new Course("Core Java", 60, 15000);
		Course c2 = new Course("DSA", 90, 20000);

		c1.displayCourseDetails();
		c2.displayCourseDetails();

		Course.updateInstituteName("OurInstitute");

		c1.displayCourseDetails();
		c2.displayCourseDetails();
	}
}
