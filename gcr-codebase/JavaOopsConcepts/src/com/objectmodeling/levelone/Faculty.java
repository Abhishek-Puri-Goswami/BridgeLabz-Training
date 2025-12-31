package com.objectmodeling.levelone;

public class Faculty {

	String facultyName;
	String subject;

	// Constructor to initialize faculty
	public Faculty(String facultyName, String subject) {
		this.facultyName = facultyName;
		this.subject = subject;
	}

	// Method to display faculty details
	public void displayFaculty() {
		System.out.println("Faculty Name : " + facultyName);
		System.out.println("Subject Name : " + subject);
	}
}
