package com.constructors.levelone;

public class Student {

    // Public: accessible everywhere
    public int rollNumber;

    // Protected: accessible within package and subclasses
    protected String name;

    // Private: accessible only within this class
    private double cgpa;

    // Initializes student details
    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Getter method for CGPA
    public double getCgpa() {
        return cgpa;
    }

    // Setter method for CGPA
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    // Displays student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}
