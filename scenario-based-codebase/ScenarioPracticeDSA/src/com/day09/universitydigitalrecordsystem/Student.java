package com.day09.universitydigitalrecordsystem;

// Represents one student record
public class Student {
    private String rollNumber; // unique key
    private String name;
    private String branch;
    private int year;

    // constructor
    public Student(String rollNumber, String name, String branch, int year) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.branch = branch;
        this.year = year;
    }

    // good string representation
    public String toString() {
        return String.format("%-12s | %-18s | %-10s | %d",
                rollNumber, name, branch, year);
    }

    // method to get roll number (unique key)
    public String getRollNumber() {
        return rollNumber;
    }
}