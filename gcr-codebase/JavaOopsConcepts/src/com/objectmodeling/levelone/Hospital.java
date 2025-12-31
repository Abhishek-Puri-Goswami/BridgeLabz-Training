package com.objectmodeling.levelone;

import java.util.ArrayList;

public class Hospital {

	public String hospitalName;
	private ArrayList<Doctor> doctors;
	private ArrayList<Patient> patients;

    // Constructor to initialize hospital
    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }

    // Method to add doctor to hospital
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Method to add patient to hospital
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Method to display hospital details
    public void displayHospital() {
        System.out.println("\nHospital Name: " + hospitalName);
        System.out.println("Doctors Count : " + doctors.size());
        System.out.println("Patients Count: " + patients.size());
    }
}
