package com.day04.edumentorapplication;

public class Instructor extends User {

    private String specialization;

    // constructor
    public Instructor(int userId, String name, String email, String specialization) {
        super(userId, name, email);
        this.specialization = specialization;
    }

    // method to display Instructor's details
    @Override
    protected void printDetails() {
        System.out.println("\n------ Instructor Details ------");
        System.out.printf("%-15s : %d%n", "User ID", userId);
        System.out.printf("%-15s : %s%n", "Name", name);
        System.out.printf("%-15s : %s%n", "Email", email);
        System.out.printf("%-15s : %s%n", "Specialization", specialization);
    }
}
