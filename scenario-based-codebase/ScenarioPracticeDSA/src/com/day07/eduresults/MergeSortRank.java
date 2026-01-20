package com.day07.eduresults;

import java.util.ArrayList;
import java.util.List;

public class MergeSortRank {

	// method to merge multiple already sorted lists into one ranked list
	public static List<Student> generateStateRank(List<List<Student>> districtLists) {
		if (districtLists == null || districtLists.isEmpty()) {
			return new ArrayList<>();
		}

		// Start with first list
		List<Student> result = new ArrayList<>(districtLists.get(0));

		// Merge remaining lists one by one
		for (int i = 1; i < districtLists.size(); i++) {
			result = mergeTwoSortedLists(result, districtLists.get(i));
		}

		return result;
	}

	// Merge two already sorted lists (stable merge)
	private static List<Student> mergeTwoSortedLists(List<Student> list1, List<Student> list2) {
		List<Student> merged = new ArrayList<>(list1.size() + list2.size());

		int i = 0, j = 0;

		while (i < list1.size() && j < list2.size()) {
			// <= makes it stable (preserves relative order of equal elements)
			if (list1.get(i).compareTo(list2.get(j)) <= 0) {
				merged.add(list1.get(i++));
			} else {
				merged.add(list2.get(j++));
			}
		}

		// Copy remaining elements
		while (i < list1.size()) {
			merged.add(list1.get(i++));
		}
		while (j < list2.size()) {
			merged.add(list2.get(j++));
		}

		return merged;
	}

	// Optional: Classic recursive merge sort (for reference/learning)
	public static void mergeSort(List<Student> students, int left, int right) {
		if (left < right) {
			int mid = left + (right - left) / 2;

			mergeSort(students, left, mid);
			mergeSort(students, mid + 1, right);

			merge(students, left, mid, right);
		}
	}

	private static void merge(List<Student> students, int left, int mid, int right) {
		List<Student> temp = new ArrayList<>(right - left + 1);

		int i = left, j = mid + 1;

		while (i <= mid && j <= right) {
			if (students.get(i).compareTo(students.get(j)) <= 0) {
				temp.add(students.get(i++));
			} else {
				temp.add(students.get(j++));
			}
		}

		while (i <= mid)
			temp.add(students.get(i++));
		while (j <= right)
			temp.add(students.get(j++));

		// Copy back
		for (int k = 0; k < temp.size(); k++) {
			students.set(left + k, temp.get(k));
		}
	}
}