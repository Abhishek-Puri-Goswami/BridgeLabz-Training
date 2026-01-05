package com.day03.campusconnectapplication;

import java.util.Scanner;

public class CampusConnectApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Faculty input
        System.out.print("Enter Faculty ID: ");
        int fid = input.nextInt();
        input.nextLine();

        System.out.print("Enter Faculty Name: ");
        String fname = input.nextLine();

        System.out.print("Enter Faculty Email: ");
        String femail = input.nextLine();

        System.out.print("Enter Department: ");
        String dept = input.nextLine();

        Faculty faculty = new Faculty(fid, fname, femail, dept);

        // Course input
        System.out.print("\nEnter Course ID: ");
        int cId = input.nextInt();
        
        input.nextLine(); // handles newline in input
        
        System.out.print("Enter Course Name: ");
        String cname = input.nextLine();

        Course course = new Course(cId, cname, faculty);

        // Student input
        System.out.print("\nEnter Student ID: ");
        int sid = input.nextInt();
        input.nextLine();

        System.out.print("Enter Student Name: ");
        String sname = input.nextLine();

        System.out.print("Enter Student Email: ");
        String semail = input.nextLine();

        Student student = new Student(sid, sname, semail);

        // enrollment in a course
        student.enrollCourse(course);

        // Grade input
        System.out.print("\nEnter Grade (A/B/C/D/F): ");
        char grade = input.next().charAt(0);

        faculty.assignGrade(student, course, grade);

        // display results
        student.printDetails();
        faculty.printDetails();
        course.printDetails();
        input.close();
    }
}
