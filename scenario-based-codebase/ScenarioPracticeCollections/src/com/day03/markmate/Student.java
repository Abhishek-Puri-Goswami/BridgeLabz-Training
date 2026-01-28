package com.day03.markmate;

public class Student {
	private String name;
	private int[] marks;
	private int total;
	private double average;
	private String grade;

	// constructor
	public Student(String name, int[] marks) {
		this.name = name;
		this.marks = marks;
		calculate();
	}

	// Assign the grade
	private void calculate() {
		total = 0;
		for (int i = 0; i < marks.length; i++) {
			total += marks[i];
		}

		average = total / (double) marks.length;
		if (average >= 90) {
			grade = "A";
		} else if (average >= 75) {
			grade = "B";
		} else if (average >= 60) {
			grade = "C";
		} else {
			grade = "D";
		}
	}

	// getters & setters
	public String getName() {
		return name;
	}

	public int[] getMarks() {
		return marks;
	}

	public int getTotal() {
		return total;
	}

	public double getAverage() {
		return average;
	}

	public String getGrade() {
		return grade;
	}

	// good string representation
	@Override
	public String toString() {
		return "Student{name='" + name + "', total=" + total + ", average=" + average + ", grade='" + grade + "'}";
	}
}
