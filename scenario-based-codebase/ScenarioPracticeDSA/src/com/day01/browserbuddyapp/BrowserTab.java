package com.day01.browserbuddyapp;

//Represents one browser tab
public class BrowserTab {
	private String title;
	private TabHistory history;

	public BrowserTab(String initialUrl) {
		this.title = "New Tab";
		this.history = new TabHistory();
		this.history.visit(initialUrl);
	}

	public void visit(String url) {
		history.visit(url);
		updateTitleFromUrl(url);
	}

	public String goBack() {
		return history.goBack();
	}

	public String goForward() {
		return history.goForward();
	}

	public String getCurrentUrl() {
		return history.getCurrentUrl();
	}

	private void updateTitleFromUrl(String url) {
		// Very simple title simulation
		if (url.contains("google")) {
			this.title = "Google";
		} else if (url.contains("youtube")) {
			this.title = "YouTube";
		} else {
			this.title = url;
		}
	}

	public String getTitle() {
		return title;
	}

	// Used when closing tab
	public TabHistory getHistory() {
		return history;
	}
}