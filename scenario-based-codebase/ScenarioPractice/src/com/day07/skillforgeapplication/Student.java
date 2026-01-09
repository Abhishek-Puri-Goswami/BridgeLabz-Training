package com.day07.skillforgeapplication;

// Student who enrolls and gets certified
public class Student extends User implements ICertifiable {

    private double progress;

    public Student(String name) {
        super(name);
        this.progress = 0;
    }

    public void updateProgress(double value) {
        progress += value;
        if (progress > 100) progress = 100;
    }

    @Override
    public void generateCertificate(double progress) {
        if (progress >= 80) {
            System.out.println("Certificate: Course Completed Successfully.");
        } else {
            System.out.println("Certificate: Not Eligible Yet.");
        }
    }

    @Override
    public void printDetails() {
        System.out.printf("%-15s : %s%n", "Student", name);
        System.out.printf("%-15s : %.2f%%%n", "Progress", progress);
    }

    public double getProgress() {
        return progress;
    }
}
