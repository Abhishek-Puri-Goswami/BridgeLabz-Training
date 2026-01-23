package com.day09.musicsystem;

// Represents one song in the music library
public class Song {
	// unique key
    private String trackId;
    private String title;
    private String artist;
    private int durationSeconds;

    // constructor
    public Song(String trackId, String title, String artist, int durationSeconds) {
        this.trackId = trackId;
        this.title = title;
        this.artist = artist;
        this.durationSeconds = durationSeconds;
    }

    // good string representation for display
    public String toString() {
        int minutes = durationSeconds / 60;
        int seconds = durationSeconds % 60;
        return String.format("%-12s | %-28s | %-20s | %02d:%02d",
                trackId, title, artist, minutes, seconds);
    }

    // method to get track ID
    public String getTrackId() {
        return trackId;
    }

    // method to get title
    public String getTitle() {
        return title;
    }
}