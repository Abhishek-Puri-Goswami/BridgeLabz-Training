package com.objectmodeling.levelone;

import java.util.Scanner;

public class UniversityManagementSystem {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter student name: ");
		UniStudent student = new UniStudent(input.nextLine());

		System.out.print("Enter professor name: ");
		UniProfessor professor = new UniProfessor(input.nextLine());

		System.out.print("Enter course name: ");
		UniCourse course = new UniCourse(input.nextLine());

		// Student enrolled into a course
		student.enrollCourse(course);

		// Course is assigned to a professor
		professor.assignCourse(course);

		student.showCourses();
		professor.showCourses();
		course.displayCourse();

		input.close();
	}
}
