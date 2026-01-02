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
