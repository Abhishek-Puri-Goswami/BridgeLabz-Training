package com.objectmodeling.levelone;

import java.util.ArrayList;

public class Patient {

	public String patientName;
	private int age;
	private ArrayList<Doctor> doctors;

	// Constructor to initialize patient
	public Patient(String patientName, int age) {
		this.patientName = patientName;
		this.age = age;
		doctors = new ArrayList<>();
	}

	// Method to add doctor to patient record
	public void addDoctor(Doctor doctor) {
		doctors.add(doctor);
	}

	// Method to display doctors consulted by patient
	public void showDoctors() {
		System.out.printf("%nPatient %s (age: %d) has consulted:%n", patientName, age);

		// Loop to display doctors
		for (Doctor doctor : doctors) {
			System.out.println("Doctor: " + doctor.doctorName);
		}
	}
}
