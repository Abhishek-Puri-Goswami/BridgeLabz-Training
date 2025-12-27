package com.constructors.levelone;

public class PostgraduateStudent extends Student {

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double cgpa) {
        super(rollNumber, name, cgpa);
    }

    // Method to display the results
    public void displayPostgraduateDetails() {
        System.out.println("Postgraduate Student Name: " + name);
    }

    // main - driver method
    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Amit", 8.5);

        pg.displayStudentDetails();
        pg.displayPostgraduateDetails();

        pg.setCgpa(9.0);
        System.out.println("Updated CGPA: " + pg.getCgpa());
    }
}
