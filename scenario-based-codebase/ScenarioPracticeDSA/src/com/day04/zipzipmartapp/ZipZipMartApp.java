/*
3. ZipZipMart – Daily Sales Summary Report (Merge Sort)
Story: 
	● ZipZipMart compiles thousands of daily sales records from all branches. 
	● To generate reports, the system sorts transactions by date and amount using 
	● Merge Sort, which ensures stability and efficiency with large datasets.
Key Concepts:
	● Divide and conquer
	● Large-scale sorting
	● Preserves order of equal items (stable)
*/

package com.day04.zipzipmartapp;

import java.time.LocalDate;
import java.util.Arrays;

public class ZipZipMartApp {

	public static void main(String[] args) {

		MartSales sales = new MartSales();

		System.out.println("======= ZipZipMart – Daily Sales Report (Merge Sort) =======");
		System.out.println("Sorting thousands of transactions by date -> amount\n");

		// Simulate sales from multiple days and branches
		sales.addAll(Arrays.asList(new SaleTransaction(LocalDate.of(2026, 1, 14), 245.50, "Indore-01", "Snacks"),
				new SaleTransaction(LocalDate.of(2026, 1, 15), 1890.00, "Bhopal-03", "Groceries"),
				new SaleTransaction(LocalDate.of(2026, 1, 14), 120.00, "Indore-02", "Beverages"),
				new SaleTransaction(LocalDate.of(2026, 1, 15), 450.75, "Ujjain-01", "Personal Care"),
				new SaleTransaction(LocalDate.of(2026, 1, 14), 980.00, "Indore-01", "Electronics"),
				new SaleTransaction(LocalDate.of(2026, 1, 15), 320.25, "Bhopal-03", "Snacks"),
				new SaleTransaction(LocalDate.of(2026, 1, 14), 675.00, "Indore-02", "Groceries"),
				new SaleTransaction(LocalDate.of(2026, 1, 15), 2100.00, "Jabalpur-01", "Appliances"),
				new SaleTransaction(LocalDate.of(2026, 1, 14), 85.00, "Indore-01", "Stationery"),
				new SaleTransaction(LocalDate.of(2026, 1, 15), 560.50, "Bhopal-03", "Beverages")));

		// Initial unsorted data
		sales.displayTransactions("Raw Sales Data (unsorted - arrival order)", true);

		System.out.println("Sorting with Merge Sort (by date -> amount)...\n");

		// Perform stable sort
		sales.sortByDateAndAmount();

		// Final sorted report
		sales.displayTransactions("Daily Sales Report – Sorted by Date & Amount", false);

		System.out.println("Total records processed: " + sales.getTransactionCount());
		System.out.println("Report ready for head office analysis.");
	}
}