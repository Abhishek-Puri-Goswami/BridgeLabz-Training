package com.encapsulation.hospitalpatientmanagement;

import java.util.ArrayList;

public class InPatient extends Patient implements MedicalRecord {

    private int daysAdmitted;
    private double dailyCharge;
    private ArrayList<String> medicalHistory = new ArrayList<>();

    // Constructor to initialize inpatient
    public InPatient(int patientId, String name, int age, int daysAdmitted, double dailyCharge) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    // Billing logic for inpatient
    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge;
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
