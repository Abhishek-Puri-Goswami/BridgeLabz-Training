package com.finalandstatic.levelone;

public class Student {
    // Attributes
    private static String universityName = "XYZ University";
    private static int totalStudents = 0;
    private String name;
    private final int rollNumber;
    private char grade;
    // Constructor
    public Student(String name, int rollNumber, char grade) {
        // Resolving ambuguity using this keyword
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }
    // Method to display total students
    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }
    // Method to display details
    public void displayDetails() {
        if(this instanceof Student) {
            System.out.println("University Name: " + universityName);
            System.out.println("Student Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid student object.");
        }
    }
    // Method to update grade
    public void updateGrade(char newGrade) {
        if(this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated for roll number: " + rollNumber);
        } else {
            System.out.println("Invalid operation on non-student object.");
        }
    }
    // Main method
    public static void main(String[] args) {
        // Create Student objects
        Student student1 = new Student("Adarsh Patel", 16461, 'A');
        Student student2 = new Student("Rahul Kushwaha", 54418, 'B');
        // Call display method
        student1.displayDetails();
        student2.displayDetails();
        // Display total students
        Student.displayTotalStudents();
        // Call update grade method to update the grade
        student1.updateGrade('O');
        student2.updateGrade('A');

        System.out.println("\nAfter Grade Update");
        // Display details after update
        student1.displayDetails();
        student2.displayDetails();

    }
}