package com.objectmodeling.levelone;

import java.util.ArrayList;

public class UniStudent {
    private String studentName;
    private ArrayList<UniCourse> courses;

    // Constructor to initialize student
    public UniStudent(String studentName) {
        this.studentName = studentName;
        courses = new ArrayList<>();
    }

    // Method for student to enroll in a course
    public void enrollCourse(UniCourse course) {
        courses.add(course);
        course.addStudent(this);
        System.out.println(studentName + " enrolled in " + course.getCourseName());
    }

    // Method to display enrolled courses
    public void showCourses() {
        System.out.println("\nStudent: " + studentName);

        // Loop to display enrolled courses
        for (UniCourse course : courses) {
            System.out.println("Course: " + course.getCourseName());
        }
    }

    // Method to get student name
    public String getStudentName() {
        return studentName;
    }
}

