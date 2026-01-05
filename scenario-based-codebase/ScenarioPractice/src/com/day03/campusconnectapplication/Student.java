package com.day03.campusconnectapplication;

import java.util.ArrayList;
import java.util.HashMap;

public class Student extends Person implements ICourseActions {

	private ArrayList<Course> coursesEnrolled;
	private HashMap<Course, Character> grades;
	private double gpa;

	// constructor
	public Student(int id, String name, String email) {
		super(id, name, email);
		this.coursesEnrolled = new ArrayList<>();
		this.grades = new HashMap<>();
	}

	// method to enroll student in a course
	@Override
	public void enrollCourse(Course course) {
		coursesEnrolled.add(course);
		course.addStudent(this);
	}

	// method to drop student from a course
	@Override
	public void dropCourse(Course course) {
		coursesEnrolled.remove(course);
		grades.remove(course);
	}

	// method for faculty to assigns grade per course
	public void assignGrade(Course course, char grade) {
		if (coursesEnrolled.contains(course)) {
			grades.put(course, grade);
			calculateGpa();
		}
	}

	// method to compute gpa from grades
	private void calculateGpa() {
		if (grades.isEmpty()) {
			gpa = 0;
			return;
		}

		int totalPoints = 0;
		for (char grade : grades.values()) {
			switch (grade) {
			case 'A':
				totalPoints += 10;
				break;
			case 'B':
				totalPoints += 8;
				break;
			case 'C':
				totalPoints += 6;
				break;
			case 'D':
				totalPoints += 4;
				break;
			default:
				totalPoints += 0;
			}
		}
		gpa = (double) totalPoints / grades.size();
	}

	// method to display student course details
	public void displayCourse() {
		System.out.println("\n------- Courses & Grades ------");
		if (coursesEnrolled.isEmpty()) {
			System.out.println("Course: Not Assigned | Grade: Not Assigned");
		} else {
			// Loop all enrolled courses
			for (Course course : coursesEnrolled) {
				System.out.print("Course: " + course.getCourseName());

				if (grades.containsKey(course)) {
					System.out.println(" | Grade: " + grades.get(course));
				} else {
					System.out.println(" | Grade: Not Assigned");
				}
			}
		}
	}

	// method to display student details
	@Override
	protected void printDetails() {
		System.out.println("\n-------- Student Details -------");
		System.out.println("Student ID    : " + id);
		System.out.println("Student Name  : " + name);
		System.out.println("Student Email : " + email);
		System.out.println("GPA           : " + gpa);
		displayCourse();
	}
}
