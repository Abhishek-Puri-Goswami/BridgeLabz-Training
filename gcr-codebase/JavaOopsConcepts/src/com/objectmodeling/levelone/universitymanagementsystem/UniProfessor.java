package com.objectmodeling.levelone;

import java.util.ArrayList;

public class UniProfessor {

    private String professorName;
    private ArrayList<UniCourse> courses;

    // Constructor to initialize professor
    public UniProfessor(String professorName) {
        this.professorName = professorName;
        courses = new ArrayList<>();
    }

    // Method to assign professor to a course
    public void assignCourse(UniCourse course) {
        courses.add(course);
        course.assignProfessor(this);
        System.out.println(professorName + " assigned to " + course.getCourseName());
    }

    // Method to display courses assigned to professor
    public void showCourses() {
        System.out.println("\nProfessor: " + professorName);

        // Loop to display courses
        for (UniCourse course : courses) {
            System.out.println("Course: " + course.getCourseName());
        }
    }

    // Method to get professor name
    public String getProfessorName() {
        return professorName;
    }
}

