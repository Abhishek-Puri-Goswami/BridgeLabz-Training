package com.day04.hospitalqueueapp;

public class Patient {
	private String name;
	private int age;

	// 1 = less urgent, 10 = life-threatening
	private int criticality;

	// constructor
	public Patient(String name, int age, int criticality) {
		this.name = name;
		this.age = age;
		this.criticality = criticality;
	}

	public int getCriticality() {
		return criticality;
	}

	// common string representation
	@Override
	public String toString() {
		return String.format("%-18s | Age: %2d | Criticality: %2d", name, age, criticality);
	}
}
