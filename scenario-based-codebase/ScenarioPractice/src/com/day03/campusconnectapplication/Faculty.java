package com.day03.campusconnectapplication;

public class Faculty extends Person {

	private String department;

	// constructor
	public Faculty(int id, String name, String email, String department) {
		super(id, name, email);
		this.department = department;
	}

	// getter for faculty name
	public String getName() {
		return name;
	}

	// Faculty assigns grade to student
	public void assignGrade(Student student, Course course, char grade) {
		student.assignGrade(course, grade);
	}

	// method to display faculty details
	@Override
	public void printDetails() {
		System.out.println("\n------- Faculty Details -------");
		System.out.println("Faculty ID      : " + this.id);
		System.out.println("Faculty Name    : " + this.name);
		System.out.println("Faculty Email   : " + this.email);
		System.out.println("Department Name : " + this.department);
	}
}
