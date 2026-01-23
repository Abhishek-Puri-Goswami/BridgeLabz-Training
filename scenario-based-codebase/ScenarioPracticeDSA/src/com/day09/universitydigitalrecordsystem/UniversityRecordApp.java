/*
1. Binary Search Tree (BST)
Story: University's Digital Record System
 	* The university needs an efficient way to manage student records searchable by roll number.
Scenarios:
	● 🔹 Scenario 1: Insertion — As students enroll, insert their roll numbers with personal
		 details.
	● 🔹 Scenario 2: Deletion — If a student leaves, remove their record.
	● 🔹 Scenario 3: Search & Display — A professor wants a sorted list of student roll
		 numbers for attendance.
*/

package com.day09.universitydigitalrecordsystem;

public class UniversityRecordApp {
	public static void main(String[] args) {
		BST studentRecords = new BST();

		System.out.println("========================================================");
		System.out.println("         UNIVERSITY STUDENT DIGITAL RECORDS");
		System.out.println("========================================================");

		// Scenario 1: Insertions (new enrollments)
		studentRecords.insert(new Student("0111CS251001", "Abhishek Goswami", "CSE", 4));
		studentRecords.insert(new Student("0111CS251002", "Divyansh Jain", "ECE", 3));
		studentRecords.insert(new Student("0111CS251003", "Ashish Pandey", "ME", 2));
		studentRecords.insert(new Student("0111CS251004", "Akshat Mishra", "CSE", 1));
		studentRecords.insert(new Student("0111CS251005", "Hariom Roy", "IT", 4));

		System.out.println("After inserting 5 students (sorted order):");
		studentRecords.printSorted();

		// Scenario 3: Search example
		System.out.println("\nSearching for roll number: 0111CS251005");
		Student found = studentRecords.search("0111CS251005");
		if (found != null) {
			System.out.println("Found:\n" + found);
		} else {
			System.out.println("Not found");
		}

		// Scenario 2: Deletion (student leaves)
		System.out.println("\nDeleting student 0111CS251005 (left university)");
		studentRecords.delete("0111CS251005");

		System.out.println("\nUpdated sorted list after deletion:");
		studentRecords.printSorted();

		System.out.println("\nBST maintains sorted order automatically - useful for attendance lists!");
	}
}