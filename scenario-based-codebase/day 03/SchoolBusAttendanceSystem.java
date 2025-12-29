/**
 * 9. School Bus Attendance System
 *      Track 10 students' presence.
 *      Use for-each loop on names.
 *      Ask "Present or Absent?"
 *      Print total present and absent counts.
 */

import java.util.Scanner;
public class SchoolBusAttendanceSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Array of 10 student names
        String[] students = {
            "Abhishek", "Divyansh", "Akshat", "Shubham", "Sourabh",
            "Ashish", "Hariom", "Raghav", "Ravi", "Vaidik"
        };

        int presentCount = 0;
        int absentCount = 0;

        System.out.println("==============================================");
        System.out.println("        SCHOOL BUS ATTENDANCE SYSTEM");
        System.out.println("==============================================");
        System.out.println("Mark attendance as:\n  'P' or 'p' for present\n  'A' or 'a' for absent.");
        System.out.println("----------------------------------------------");
        System.out.printf(" %-20s | %-15s\n", "Student Name", "Attendance");
        System.out.println("----------------------------------------------");

        // for-each loop to check attendance
        for (String name : students) {
            System.out.printf(" %-20s | ", name);
            char status = input.next().charAt(0);

            if (status == 'P' || status == 'p') {
                presentCount++;
            } else {
                absentCount++;
            }
        }

        // Attendance summary
        System.out.println("----------------------------------------------");
        System.out.printf(" %-20s | %5d\n", "Total Students", students.length);
        System.out.printf(" %-20s | %5d\n", "Present Students", presentCount);
        System.out.printf(" %-20s | %5d\n", "Absent Students", absentCount);
        System.out.println("==============================================");
        System.out.println("  ATTENDANCE COLLECTION SUCCESSFUL!");
        System.out.println("==============================================");

        input.close();
    }
}
