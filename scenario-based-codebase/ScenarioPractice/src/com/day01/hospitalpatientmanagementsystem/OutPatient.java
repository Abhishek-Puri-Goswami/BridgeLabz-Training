package com.day01.hospitalpatientmanagementsystem;

public class OutPatient extends Patient {

	// normal
	public OutPatient(int patientId, String name, int age) {
		super(patientId, name, age);
	}

	// emergency
	public OutPatient(int patientId, String name, int age, String condition) {
		super(patientId, name, age, condition);
	}

	@Override
	public void displayInfo() {
		System.out.println("Out-Patient Details");
		System.out.println(getSummary());
		showMedicalHistory();
		showBill();
	}
}
