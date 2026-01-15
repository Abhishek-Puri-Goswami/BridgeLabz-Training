package com.day04.examcellapp;

import java.util.ArrayList;
import java.util.List;

public class ExamCell {
	private List<Score> allStudents;

	// constructor
	public ExamCell() {
		allStudents = new ArrayList<>();
	}

	// Add a pre-sorted list from one test center
	public void addCenterScores(List<Score> centerList) {
		System.out.println("Received " + centerList.size() + " students from center.");
		allStudents.addAll(centerList);
	}

	
	// Merge Sort – used to sort the combined list by marks (descending)
	public void generateStateRankList() {
		if (allStudents.size() <= 1)
			return;

		List<Score> temp = new ArrayList<>(allStudents.size());
		mergeSort(0, allStudents.size() - 1, temp);
	}

	private void mergeSort(int left, int right, List<Score> temp) {
		if (left >= right)
			return;

		int mid = left + (right - left) / 2;

		mergeSort(left, mid, temp);
		mergeSort(mid + 1, right, temp);
		merge(left, mid, right, temp);
	}

	private void merge(int left, int mid, int right, List<Score> temp) {
		// empty before reuse
		temp.clear();

		// Copy to temp array
		for (int i = left; i <= right; i++) {
			temp.add(allStudents.get(i));
		}

		int n1 = mid - left + 1;
		int n2 = right - mid;
		
		int i = 0; // left half pointer
		int j = mid - left + 1; // right half pointer
		int k = left; // main array pointer

		while (i < n1 && j < n2) {
			if (temp.get(i).compareTo(temp.get(j)) <= 0) {
				allStudents.set(k, temp.get(i));
				i++;
			} else {
				allStudents.set(k, temp.get(j));
				j++;
			}
			k++;
		}

		// Copy remaining left half (if any)
		while (i < n1) {
			allStudents.set(k, temp.get(i));
			i++;
			k++;
		}
		// Right half already in place
	}

	// Display top ranks
	public void displayTopRanks(int topN) {
		System.out.println("\nState Level Top " + topN + " Ranks");
		System.out.println("=".repeat(80));

		int limit = Math.min(topN, allStudents.size());
		for (int i = 0; i < limit; i++) {
			System.out.println(allStudents.get(i).toRankString(i + 1));
		}

		System.out.println("=".repeat(80));
		System.out.println("Total students ranked: " + allStudents.size());
	}

	public int getTotalStudents() {
		return allStudents.size();
	}
}