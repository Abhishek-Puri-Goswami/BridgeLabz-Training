package com.day04.zipzipmartapp;

import java.util.ArrayList;
import java.util.List;

public class MartSales {
	private List<SaleTransaction> transactions;

	// constructor
	public MartSales() {
		transactions = new ArrayList<>();
	}

	public void addTransaction(SaleTransaction t) {
		transactions.add(t);
	}

	public void addAll(List<SaleTransaction> list) {
		transactions.addAll(list);
	}

	/**
	 * Sorts all transactions using Merge Sort. Stable sort: first by date (asc),
	 * then by amount (asc)
	 */
	public void sortByDateAndAmount() {
		if (transactions.size() <= 1)
			return;

		List<SaleTransaction> temp = new ArrayList<>(transactions.size());
		mergeSort(0, transactions.size() - 1, temp);
	}

	private void mergeSort(int left, int right, List<SaleTransaction> temp) {
		if (left >= right)
			return;

		int mid = left + (right - left) / 2;

		mergeSort(left, mid, temp);
		mergeSort(mid + 1, right, temp);
		merge(left, mid, right, temp);
	}

	private void merge(int left, int mid, int right, List<SaleTransaction> temp) {
		// empty before reuse
		temp.clear();

		// Copy to temp list
		for (int i = left; i <= right; i++) {
			temp.add(transactions.get(i));
		}
		
		int n1 = mid - left + 1;
		int n2 = right - mid;

		int i = 0; // left subarray pointer
		int j = mid - left + 1; // right subarray pointer
		int k = left; // main array pointer

		while (i < n1 && j < n2) {
			if (temp.get(i).compareTo(temp.get(j)) <= 0) {
	            transactions.set(k, temp.get(i));
	            i++;
	        } else {
	            transactions.set(k, temp.get(j));
	            j++;
	        }
			k++;
		}

		// Copy remaining left half (if any)
		while (i < n1) {
			transactions.set(k, temp.get(i));
			i++;
			k++;
		}
		// Right half already in place (no need to copy)
	}

	public void displayTransactions(String title, boolean fullDetail) {
		System.out.println("\n" + title);
		System.out.println("============================================================");
		if (transactions.isEmpty()) {
			System.out.println("No transactions recorded.");
			return;
		}

		int count = 1;
		for (SaleTransaction t : transactions) {
			if (fullDetail) {
				System.out.printf("%3d) %s%n", count++, t);
			} else {
				System.out.printf("%3d) %s%n", count++, t.getSummary());
			}
		}
		System.out.println("============================================================");
		System.out.println("Total transactions: " + transactions.size() + "\n");
	}

	public int getTransactionCount() {
		return transactions.size();
	}
}