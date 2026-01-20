package com.day08.gamerzone;

public class Player {
	private String username;
	private int score;
	private String region;

	// constructor
	public Player(String username, int score, String region) {
		this.username = username;
		this.score = score;
		this.region = region;
	}

	// good string representation
	public String toString() {
		return String.format("%-18s | %8d | %s", username, score, region);
	}

	// method to get score
	public int getScore() {
		return score;
	}

	// method to get username
	public String getUsername() {
		return username;
	}
}