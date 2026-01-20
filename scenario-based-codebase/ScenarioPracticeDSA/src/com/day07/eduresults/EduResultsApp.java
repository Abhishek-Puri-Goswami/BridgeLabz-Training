/*
3. EduResults – Rank Sheet Generator (Merge Sort)
Story: 
	● An educational board compiles marks of thousands of students from different districts.
	● Each district submits a sorted list of students by score. 
	● The main server needs to merge and sort all these lists into a final state-wise rank list. 
	● Merge Sort ensures efficiency and maintains stability for duplicate scores.
Concepts Involved:
	● Merge Sort
	● Merging sorted sublists
	● Large datasets with stable sorting
*/

package com.day07.eduresults;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EduResultsApp {

	public static void main(String[] args) {
		// Example sorted district lists (different districts)
		List<List<Student>> districtResults = new ArrayList<>();

		// District 1 - Indore
		districtResults.add(Arrays.asList(new Student("Aarav Sharma", 10021, 98, "Indore"),
				new Student("Ishita Verma", 10045, 95, "Indore"), new Student("Rahul Jain", 10078, 92, "Indore"),
				new Student("Priya Singh", 10012, 92, "Indore")));

		// District 2 - Bhopal
		districtResults.add(Arrays.asList(new Student("Ananya Gupta", 20034, 99, "Bhopal"),
				new Student("Vihaan Patel", 20019, 96, "Bhopal"), new Student("Aditi Mehta", 20067, 93, "Bhopal"),
				new Student("Arjun Yadav", 20088, 90, "Bhopal")));

		// District 3 - Gwalior
		districtResults.add(Arrays.asList(new Student("Saanvi Reddy", 30015, 97, "Gwalior"),
				new Student("Reyansh Kumar", 30042, 94, "Gwalior"), new Student("Myra Joshi", 30059, 91, "Gwalior"),
				new Student("Kavya Thakur", 30071, 91, "Gwalior")));

		System.out.println("Generating State-wide Rank List...\n");

		// Merge all district sorted lists
		List<Student> finalRankList = MergeSortRank.generateStateRank(districtResults);

		// Print top ranks
		System.out.println("_________________________________________________________________");
		System.out.println("|                      STATE RANK LIST                           |");
		System.out.println("|________________________________________________________________|");
		System.out.println("| Rank          | Name          | Score        | District        |");
		System.out.println("|________________________________________________________________|");

		for (int rank = 1; rank <= finalRankList.size(); rank++) {
			Student s = finalRankList.get(rank - 1);
			System.out.printf("| %-13d | %-13s | %-12d | %-15s |%n", rank, s.getName(),
					s.getScore(), s.toString().split("\\|")[3].trim());
		}

		System.out.println("|_______________|_______________|______________|_________________|");
		System.out.println("\nNote: Students with same score maintain relative order (stable sorting)");
	}
}