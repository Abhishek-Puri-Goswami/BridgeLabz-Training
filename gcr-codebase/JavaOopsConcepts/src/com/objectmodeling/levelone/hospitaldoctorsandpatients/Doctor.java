package com.objectmodeling.levelone;

import java.util.ArrayList;

public class Doctor {

	public String doctorName;
	private String specialization;
	private ArrayList<Patient> patients;

	// Constructor to initialize doctor
	public Doctor(String doctorName, String specialization) {
		this.doctorName = doctorName;
		this.specialization = specialization;
		patients = new ArrayList<>();
	}

	// Method to consult a patient (communication logic)
	public void consult(Patient patient) {
		patients.add(patient);
		patient.addDoctor(this);

		System.out.println("\nConsultation Started");
		System.out.println("Doctor   : " + doctorName + " (" + specialization + ")");
		System.out.println("Patient  : " + patient.patientName);
	}

	// Method to display patients consulted by doctor
	public void showPatients() {
		System.out.println("\nDoctor " + doctorName + " has consulted:");

		// Loop to display patients
		for (Patient patient : patients) {
			System.out.println("Patient: " + patient.patientName);
		}
	}
}
