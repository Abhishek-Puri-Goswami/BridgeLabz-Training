package com.day07.eduresults;

public class Student implements Comparable<Student> {
	private String name;
	private int rollNumber;
	private int score;
	private String district;

	// constructor
	public Student(String name, int rollNumber, int score, String district) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.score = score;
		this.district = district;
	}

	// method to compare two students
	@Override
	public int compareTo(Student other) {
		// Higher score first -> descending order
		// If scores equal -> stable (original district order preserved)
		return Integer.compare(other.score, this.score);
	}

	// good string representation
	@Override
	public String toString() {
		return String.format("%-25s | Roll: %6d | Score: %3d | %s", name, rollNumber, score, district);
	}

	public int getScore() {
		return score;
	}

	public String getName() {
		return name;
	}
}