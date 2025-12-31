package com.objectmodeling.levelone;

import java.util.Scanner;

public class UniversityWithFacultiesAndDepartments {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter university name: ");
		String universityName = input.nextLine();
		University university = new University(universityName);

		System.out.print("Enter department name: ");
		String deptName = input.nextLine();
		university.addDepartment(deptName);

		System.out.print("Enter faculty name: ");
		String facultyName = input.nextLine();

		System.out.print("Enter subject name: ");
		String subject = input.nextLine();

		// Aggregation
		// Faculty created independently
		Faculty faculty = new Faculty(facultyName, subject);
		university.addFaculty(faculty);

		university.displayUniversity();

		// Composition
		// Deleting university deletes departments
		university.deleteUniversity();

		input.close();
	}
}
