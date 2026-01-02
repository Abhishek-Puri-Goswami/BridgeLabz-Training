package com.objectmodeling.levelone;

public class UniDepartment {

	String departmentName;

	// Constructor to initialize university department
	public UniDepartment(String departmentName) {
		this.departmentName = departmentName;
	}

	// Method to display department details
	public void displayDepartment() {
		System.out.println("Department Name: " + departmentName);
	}
}
