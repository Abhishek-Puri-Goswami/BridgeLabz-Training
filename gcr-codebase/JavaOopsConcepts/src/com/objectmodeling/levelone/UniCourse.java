package com.objectmodeling.levelone;

import java.util.ArrayList;

public class UniCourse {

	private String courseName;
	private UniProfessor professor;
	private ArrayList<UniStudent> students;

	// Constructor to initialize course
	public UniCourse(String courseName) {
		this.courseName = courseName;
		students = new ArrayList<>();
	}

	// Method to add student to course
	public void addStudent(UniStudent student) {
		students.add(student);
	}

	// Method to assign professor to course
	public void assignProfessor(UniProfessor professor) {
		this.professor = professor;
	}

	// Method to display course details
	public void displayCourse() {
		System.out.println("\nCourse: " + courseName);
		System.out.println("Professor: " + (professor != null ? professor.getProfessorName() : "Not Assigned"));

		// Loop to display enrolled students
		for (UniStudent student : students) {
			System.out.println("Student: " + student.getStudentName());
		}
	}

	// Method to get course name
	public String getCourseName() {
		return courseName;
	}
}
