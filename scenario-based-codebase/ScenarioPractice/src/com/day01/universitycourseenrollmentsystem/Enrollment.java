package com.day01.universitycourseenrollmentsystem;

public class Enrollment {

    private Student student;
    private Course course;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public void showEnrollment() {
        student.displayInfo();
        course.displayCourse();
    }
}
