/*
3. University Course Enrollment System
Scenario: Students should be able to enroll in courses, and faculty can assign grades.
Concepts Used:
● Class: Student, Course, Faculty, Enrollment
● Constructors: Used to create students with/without elective preferences
● Access Modifiers: private for internal GPA fields, public method to access
transcript
● Interface: Graded with method assignGrade()
● Operators: GPA calculations and comparisons (using +, /, etc.)
● OOP:
○ Encapsulation: Secure handling of grades
○ Inheritance: Undergraduate, Postgraduate extend Student

Scenario-based Problems
○ Abstraction: Interface allows different grading styles
○ Polymorphism: assignGrade() works differently for pass/fail vs. letter grading
*/

package com.day01.universitycourseenrollmentsystem;

public class UniversityCourseEnrollmentSystem {
	public static void main(String[] args) {

		Student ugStudent = new Undergraduate(1, "Divyansh");
		Student pgStudent = new Postgraduate(2, "Ashish");

		Course course = new Course("CS101", "Object Oriented Programming");
		course.displayCourse();
		System.out.println("-----------------------");

		Faculty faculty = new Faculty(101, "Dr. Akshat");
		faculty.displayFaculty();
		System.out.println("-----------------------");

		Enrollment e1 = new Enrollment(ugStudent, course);
		Enrollment e2 = new Enrollment(pgStudent, course);

		faculty.assignGrade((Graded) ugStudent, 55);
		faculty.assignGrade((Graded) pgStudent, 75);

		e1.showEnrollment();
		System.out.println("-----------------------");
		e2.showEnrollment();
	}
}
