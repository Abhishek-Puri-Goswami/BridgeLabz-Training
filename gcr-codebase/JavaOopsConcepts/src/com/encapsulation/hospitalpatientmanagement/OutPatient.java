package com.encapsulation.hospitalpatientmanagement;

import java.util.ArrayList;

public class OutPatient extends Patient implements MedicalRecord {

    private double consultationFee;
    private ArrayList<String> medicalHistory = new ArrayList<>();

    // Constructor to initialize outpatient
    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    // Billing logic for outpatient
    @Override
    public double calculateBill() {
        return consultationFee;
    }

    // Add medical record securely
    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    // View medical records
    @Override
    public void viewRecords() {
        System.out.println("Medical History:");
        for (String record : medicalHistory) {
            System.out.println("- " + record);
        }
    }
}
