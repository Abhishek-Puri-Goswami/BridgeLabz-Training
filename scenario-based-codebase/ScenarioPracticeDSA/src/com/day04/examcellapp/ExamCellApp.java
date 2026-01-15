/*
5. ExamCell – Student Rank Generator (Merge Sort)
Story: 
	● An online exam system collects scores from multiple test centers. 
	● To publish a state-level rank list, student scores are merged and 
	● sorted using Merge Sort, ensuring performance and accuracy.
Key Concepts:
	● Merging pre-sorted center-wise scores
	● Sorting across centers
	● High efficiency for big data
*/

package com.day04.examcellapp;

import java.util.Arrays;
import java.util.List;

public class ExamCellApp {
 public static void main(String[] args) {
     ExamCell examCell = new ExamCell();

     System.out.println("==================== ExamCell – State Level Rank Generator ====================");
     System.out.println("Merging & sorting scores from all test centers using Merge Sort\n");

     // Added three test centers
     // each already sorted internally (by roll no or local rank)
     List<Score> centerIndore = Arrays.asList(
         new Score("MP01A001", "Aarav Sharma",  385, "INDORE-01"),
         new Score("MP01A002", "Priya Jain",    412, "INDORE-01"),
         new Score("MP01A003", "Rohan Gupta",   378, "INDORE-01"),
         new Score("MP01A004", "Sneha Verma",   445, "INDORE-01")
     );

     List<Score> centerBhopal = Arrays.asList(
         new Score("MP02B001", "Aditya Singh",  420, "BHOPAL-02"),
         new Score("MP02B002", "Ananya Patel",  398, "BHOPAL-02"),
         new Score("MP02B003", "Karan Malviya", 456, "BHOPAL-02"),
         new Score("MP02B004", "Neha Thakur",   389, "BHOPAL-02")
     );

     List<Score> centerJabalpur = Arrays.asList(
         new Score("MP03C001", "Vikram Yadav",  432, "JABALPUR-03"),
         new Score("MP03C002", "Shreya Joshi",  467, "JABALPUR-03"),
         new Score("MP03C003", "Rahul Tiwari",  401, "JABALPUR-03"),
         new Score("MP03C004", "Ishita Dubey",  415, "JABALPUR-03")
     );

     System.out.println("Receiving sorted score lists from centers...");

     examCell.addCenterScores(centerIndore);
     examCell.addCenterScores(centerBhopal);
     examCell.addCenterScores(centerJabalpur);

     System.out.println("\nTotal students collected: " + examCell.getTotalStudents());
     System.out.println("Generating state-wide merit list using Merge Sort...");

     // Perform merge sort - highest marks first
     examCell.generateStateRankList();

     // Show top ranks
     examCell.displayTopRanks(10);
     System.out.println("Rank list published successfully.");
 }
}