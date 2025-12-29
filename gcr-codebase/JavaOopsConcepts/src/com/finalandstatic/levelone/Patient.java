package com.finalandstatic.levelone;

public class Patient {
    // Attributes
    private static String hospitalName = "City Hospital";
    private static int totalPatient = 0;
    private String name;
    private int age;
    private String ailment;
    private final int patientId;
    // Constructor
    public Patient(String name, int age, String ailment, int patientId) {
        // Resolving ambiguity using this keyword
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientId = patientId;
        totalPatient++;
    }
    // Method to display total number of patients
    public static void getTotalPatients() {
        System.out.println("Total patients admitted: " + totalPatient);
    }
    // Method to display the details
    public void displayDetails() {
        if(this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Patient ID: " + patientId);
        } else {
            System.out.println("Invalid patient object.");
        }
    }
    // Main method
    public static void main(String[] args) {
        // Create patient objects
        Patient patient1 = new Patient("Alice", 28, "Flu", 694613);
        Patient patient2 = new Patient("Bob", 45, "Diabetes", 695461);
        // Display patient details
        patient1.displayDetails();
        System.out.println();
        patient2.displayDetails();
        // Display total patients
        Patient.getTotalPatients();
    }
}