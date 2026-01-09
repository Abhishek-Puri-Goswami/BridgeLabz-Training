package com.day07.skillforgeapplication;

import java.util.Scanner;

public class SkillForgeApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Instructor Name: ");
        String iname = input.nextLine();
        Instructor instructor = new Instructor(iname);

        System.out.print("Enter Course Title: ");
        String title = input.nextLine();

        Course course = new Course(title, instructor);

        System.out.print("Enter Student Name: ");
        String sname = input.nextLine();
        Student student = new Student(sname);

        System.out.print("Enter completed modules: ");
        int completed = input.nextInt();

        // Loop calculates progress based on modules completed
        double progress = (completed * 100.0) / course.getTotalModules();
        student.updateProgress(progress);

        System.out.println("\n--- Course Details ---");
        System.out.printf("%-15s %-15s %-10s%n", "Title", "Instructor", "Rating");
        course.printCourse();

        System.out.println("\n--- Student Details ---");
        student.printDetails();

        System.out.println("\n--- Certification ---");
        student.generateCertificate(student.getProgress());

        input.close();
    }
}
