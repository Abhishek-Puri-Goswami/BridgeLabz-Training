package com.day04.eventmanagerapp;

import java.util.ArrayList;
import java.util.List;

public class EventTicketManager {
	private List<Ticket> tickets;
	// for experiment purpose
	private long comparisonCount = 0;

	// constructor
	public EventTicketManager() {
		tickets = new ArrayList<>();
	}

	public void addTicket(Ticket t) {
		tickets.add(t);
	}

	public void addAll(List<Ticket> list) {
		tickets.addAll(list);
	}

	/**
	 * Quick Sort - sorts tickets by price (ascending by default) 
	 * Average: O(n log n), 
	 * Worst: O(n^2) - but rare with good pivot
	 */
	public void sortByPrice(boolean ascending) {
		comparisonCount = 0;
		if (tickets.size() <= 1)
			return;

		quickSort(0, tickets.size() - 1, ascending);
	}

	private void quickSort(int low, int high, boolean ascending) {
		if (low < high) {
			int pivotIndex = partition(low, high, ascending);
			quickSort(low, pivotIndex - 1, ascending);
			quickSort(pivotIndex + 1, high, ascending);
		}
	}

	private int partition(int low, int high, boolean ascending) {
		Ticket pivot = tickets.get(high);
		int i = low - 1;

		for (int j = low; j < high; j++) {
			comparisonCount++;
			Ticket current = tickets.get(j);

			// Compare prices (ascending or descending)
			boolean shouldSwap = ascending ? current.getPrice() < pivot.getPrice()
					: current.getPrice() > pivot.getPrice();

			if (shouldSwap) {
				i++;
				swap(i, j);
			}
		}

		swap(i + 1, high);
		return i + 1;
	}

	private void swap(int i, int j) {
		Ticket temp = tickets.get(i);
		tickets.set(i, tickets.get(j));
		tickets.set(j, temp);
	}

	public void displayTopTickets(String title, int count, boolean cheapestFirst) {
		System.out.println("\n" + title);
		System.out.println("=".repeat(80));

		if (tickets.isEmpty()) {
			System.out.println("No tickets available.");
			return;
		}

		// Make a copy of original list
		List<Ticket> copy = new ArrayList<>(tickets);
		EventTicketManager tempManager = new EventTicketManager();
		tempManager.addAll(copy);
		tempManager.sortByPrice(cheapestFirst);

		int limit = Math.min(count, tempManager.tickets.size());
		for (int i = 0; i < limit; i++) {
			System.out.printf("%2d. %s%n", i + 1, tempManager.tickets.get(i));
		}

		System.out.println("=".repeat(80));
		System.out.printf("Showing top %d %s tickets (total: %d)%n%n", limit,
				cheapestFirst ? "cheapest" : "most expensive", tempManager.tickets.size());
	}

	public long getComparisonCount() {
		return comparisonCount;
	}

	public int getTicketCount() {
		return tickets.size();
	}
}