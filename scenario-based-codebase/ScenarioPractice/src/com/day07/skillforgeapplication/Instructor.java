package com.day07.skillforgeapplication;

// Instructor who creates courses
public class Instructor extends User {

	public Instructor(String name) {
		super(name);
	}

	@Override
	public void printDetails() {
		System.out.println("--- Instructor ---");
		System.out.printf("%-15s : %s%n", "Instructor", name);
	}
}
