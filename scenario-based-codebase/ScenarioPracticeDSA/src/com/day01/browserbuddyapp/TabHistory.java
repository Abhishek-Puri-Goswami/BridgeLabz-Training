package com.day01.browserbuddyapp;

//Doubly Linked List to manage browsing history of one tab
public class TabHistory {
	private HistoryNode head; // oldest page
	private HistoryNode tail; // current page
	private HistoryNode current; // pointer to current position

	public TabHistory() {
		head = null;
		tail = null;
		current = null;
	}

	// Add new page (when user visits new URL)
	public void visit(String url) {
		HistoryNode newNode = new HistoryNode(url);

		// If first visit
		if (head == null) {
			head = newNode;
			tail = newNode;
			current = newNode;
			return;
		}

		// Add after current position
		newNode.prev = current;
		current.next = newNode;
		tail = newNode;
		current = newNode;
	}

	// Go back - returns previous URL or null
	public String goBack() {
		if (current == null || current.prev == null) {
			return null;
		}
		current = current.prev;
		return current.url;
	}

	// Go forward - returns next URL or null
	public String goForward() {
		if (current == null || current.next == null) {
			return null;
		}
		current = current.next;
		return current.url;
	}

	// Get current page URL
	public String getCurrentUrl() {
		return (current != null) ? current.url : null;
	}

	// Used when tab is closed - returns the whole history
	public HistoryNode getTail() {
		return tail;
	}
}