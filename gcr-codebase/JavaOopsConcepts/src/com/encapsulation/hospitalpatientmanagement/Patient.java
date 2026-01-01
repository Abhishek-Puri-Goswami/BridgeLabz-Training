package com.encapsulation.hospitalpatientmanagement;

public abstract class Patient {

    private int patientId;
    private String name;
    private int age;

    // Constructor to initialize patient details
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Abstract method to calculate bill
    public abstract double calculateBill();

    // Concrete method to display patient details
    public void getPatientDetails() {
        System.out.println("Patient ID : " + patientId);
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Bill Amount: " + calculateBill());
    }

    // Encapsulated accessors
    protected int getPatientId() {
        return patientId;
    }
}
