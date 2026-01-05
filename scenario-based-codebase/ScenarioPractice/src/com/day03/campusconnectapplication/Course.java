package com.day03.campusconnectapplication;

import java.util.ArrayList;

public class Course {
	private int courseId;
	private String courseName;
	private Faculty faculty;
	private ArrayList<Student> enrolledStudents;

	// constructor
	public Course(int courseId, String courseName, Faculty faculty) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.faculty = faculty;
		this.enrolledStudents = new ArrayList<>();
	}

	public void addStudent(Student student) {
		enrolledStudents.add(student);
	}

	public boolean removeStudent(Student student) {
		return enrolledStudents.remove(student);
	}

	public String getCourseName() {
		return courseName;
	}

	public void printDetails() {
		System.out.println("\n------- Course Details --------");
		System.out.println("Course Code : " + courseId);
		System.out.println("Course Name : " + courseName);
		System.out.println("Faculty     : " + faculty.getName());
	}
}
