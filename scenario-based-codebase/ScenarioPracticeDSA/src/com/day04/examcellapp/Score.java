package com.day04.examcellapp;

public class Score implements Comparable<Score> {
	private final String rollNumber;
	private final String name;
	private final int marks;
	private final String centerCode;

	// constructor
	public Score(String rollNumber, String name, int marks, String centerCode) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
		this.centerCode = centerCode;
	}

	public int getMarks() {
		return marks;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	// method to make object comparisons
	@Override
	public int compareTo(Score other) {
		// Sort by marks DESCENDING (higher marks first)
		// If marks equal → stable (original order preserved by merge sort)
		return Integer.compare(other.marks, this.marks);
	}

	// common string representations
	@Override
	public String toString() {
		return String.format("%-12s | %-20s | Marks: %3d | Center: %s", rollNumber, name, marks, centerCode);
	}

	public String toRankString(int rank) {
		return String.format("Rank %4d | %s", rank, this);
	}
}