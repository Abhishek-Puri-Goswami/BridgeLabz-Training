package com.day10.gamingapp;

// Represents one player on the leaderboard
public class Player {
	// unique key
    private String playerId;
    private String username;
    private int score;
    private String region;

    // constructor
    public Player(String playerId, String username, int score, String region) {
        this.playerId = playerId;
        this.username = username;
        this.score = score;
        this.region = region;
    }

    // update score
    public void updateScore(int points) {
        this.score += points;
    }

    // good string representation for leaderboard display
    public String toString() {
        return String.format("%-15s | %-18s | %8d | %s",
                playerId, username, score, region);
    }

    public String getPlayerId() {
        return playerId;
    }

    public int getScore() {
        return score;
    }

    public String getUsername() {
        return username;
    }
}