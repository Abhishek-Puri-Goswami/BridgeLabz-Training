package com.objectmodeling.levelone;

import java.util.ArrayList;

public class University {

	String universityName;
	ArrayList<UniDepartment> departments;
	ArrayList<Faculty> faculties;

	// Constructor to initialize university
	public University(String universityName) {
		this.universityName = universityName;
		departments = new ArrayList<>();
		faculties = new ArrayList<>();
	}

	// Method to create department inside university
	public void addDepartment(String departmentName) {
		// composition
		UniDepartment department = new UniDepartment(departmentName);
		departments.add(department);
	}

	// Method to add faculty to university
	public void addFaculty(Faculty faculty) {
        // Aggregation
		faculties.add(faculty);
	}

	// Method to display university structure
	public void displayUniversity() {
		System.out.println("\nUniversity Name: " + universityName);
		System.out.println("=====================================");

		System.out.println("Departments:-");
		// Loop to display departments
		for (UniDepartment department : departments) {
			department.displayDepartment();
		}

		System.out.println("\nFaculty Members:");
		// Loop to display faculty
		for (Faculty faculty : faculties) {
			System.out.println("-------------------");
			faculty.displayFaculty();
		}
	}

	// Method to delete university (composition cleanup)
	public void deleteUniversity() {
		departments.clear();
		System.out.println("\nUniversity deleted. All departments removed.");
	}
}
