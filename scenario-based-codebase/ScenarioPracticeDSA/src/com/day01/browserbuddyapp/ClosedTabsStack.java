package com.day01.browserbuddyapp;

//Stack to store recently closed tabs (LIFO - Last In First Out)
public class ClosedTabsStack {
	private static final int MAX_CLOSED_TABS = 10;
	private BrowserTab[] stack;
	private int top;

	public ClosedTabsStack() {
		stack = new BrowserTab[MAX_CLOSED_TABS];
		top = -1;
	}

	// Push closed tab to stack
	public void push(BrowserTab tab) {
		if (top >= MAX_CLOSED_TABS - 1) {
			// Simple: remove oldest closed tab (shift)
			for (int i = 0; i < MAX_CLOSED_TABS - 1; i++) {
				stack[i] = stack[i + 1];
			}
			top = MAX_CLOSED_TABS - 2;
		}
		stack[++top] = tab;
	}

	// Pop most recently closed tab
	public BrowserTab pop() {
		if (top < 0) {
			return null;
		}
		return stack[top--];
	}

	public boolean isEmpty() {
		return top < 0;
	}
}