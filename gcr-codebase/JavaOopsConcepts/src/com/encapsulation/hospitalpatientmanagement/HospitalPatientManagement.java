package com.encapsulation.hospitalpatientmanagement;

import java.util.ArrayList;

public class HospitalPatientManagement {

	public static void main(String[] args) {

		ArrayList<Patient> patients = new ArrayList<>();

		Patient p1 = new InPatient(1, "Divyansh", 45, 5, 3000);
		Patient p2 = new OutPatient(2, "Abhishek", 30, 800);

		((MedicalRecord) p1).addRecord("Diabetes");
		((MedicalRecord) p1).addRecord("Blood Pressure");

		((MedicalRecord) p2).addRecord("Seasonal Flu");

		patients.add(p1);
		patients.add(p2);

		// Polymorphism: handling different patient types
		for (Patient patient : patients) {

			patient.getPatientDetails();

			if (patient instanceof MedicalRecord) {
				((MedicalRecord) patient).viewRecords();
			}

			System.out.println("----------------------------");
		}
	}
}
