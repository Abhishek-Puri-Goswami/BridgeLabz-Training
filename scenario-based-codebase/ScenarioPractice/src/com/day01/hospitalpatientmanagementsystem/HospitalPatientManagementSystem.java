package com.day01.hospitalpatientmanagementsystem;

public class HospitalPatientManagementSystem {
	public static void main(String[] args) {
		Doctor doctor = new Doctor(101, "Dr. Divyansh", "Cardiology");
		doctor.displayInfo();
        System.out.println("-------------------");

		Patient p1 = new InPatient(1, "Akshat", 20, 4, "Chest Pain");
		p1.assignDoctor(doctor);

		Patient p2 = new OutPatient(1, "Abhishek", 21, "Back Pain");
		p2.assignDoctor(doctor);

		Bill b1 = new Bill(4000, 0.05, 500);
		p1.generateBill(b1);
        p1.displayInfo();

        System.out.println("-------------------");
        
		Bill b2 = new Bill(9000, 0.10, 2000);
		p2.generateBill(b2);
		p2.displayInfo();
	}
}
