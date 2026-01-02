package com.objectmodeling.levelone;

import java.util.Scanner;

public class HospitalDoctorsAndPatients {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter hospital name: ");
		Hospital hospital = new Hospital(input.nextLine());

		System.out.print("Enter doctor name: ");
		String doctorName = input.nextLine();

		System.out.print("Enter doctor specialization: ");
		String specialization = input.nextLine();

		Doctor doctor = new Doctor(doctorName, specialization);
		hospital.addDoctor(doctor);

		System.out.print("Enter patient name: ");
		String patientName = input.nextLine();

		System.out.print("Enter patient age: ");
		int age = input.nextInt();

		Patient patient = new Patient(patientName, age);
		hospital.addPatient(patient);

		// Association and Communication
		// Doctor consulting patient
		doctor.consult(patient);

		doctor.showPatients();
		patient.showDoctors();

		hospital.displayHospital();

		input.close();
	}
}
