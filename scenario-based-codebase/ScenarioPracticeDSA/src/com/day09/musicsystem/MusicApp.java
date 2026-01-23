/*
1. Binary Search Tree (BST)
Story: Music App - Organize Songs by Track ID
	A music streaming app organizes tracks in a library using track IDs.
Scenarios:
	● 🔹 Scenario 1: Search Track — Users want to search a song using track ID.
	● 🔹 Scenario 2: Insert New Track — Add new releases to the library.
	● 🔹 Scenario 3: Show Playlist Alphabetically — In-order traversal by song title.
*/

package com.day09.musicsystem;

public class MusicApp {
    public static void main(String[] args) {
        MusicLibraryBST library = new MusicLibraryBST();

        System.out.println("================================================================================");
        System.out.println("                          MUSIC STREAMING LIBRARY");
        System.out.println("================================================================================");

        // Scenario 2: Adding new tracks / new releases
        library.addTrack(new Song("S01", "Shape of You", "Ed Sheeran", 233));
        library.addTrack(new Song("S05", "Blinding Lights", "The Weeknd", 200));
        library.addTrack(new Song("S02", "Bad Guy", "Billie Eilish", 194));
        library.addTrack(new Song("S04", "Levitating", "Dua Lipa", 203));
        library.addTrack(new Song("S03", "Stay", "The Kid LAROI", 141));

        System.out.println("All tracks (sorted by Track ID):");
        library.showPlaylistAlphabetically();

        // Scenario 1: User searches for a song
        System.out.println("\nUser searching for track ID: S05");
        Song found = library.searchTrack("S05");
        
        if (found != null) {
            System.out.println("Found: " + found);
        } else {
            System.out.println("Track not found");
        }

        // Add one more track (out of order ID)
        library.addTrack(new Song("S06", "drivers license", "Olivia Rodrigo", 242));

        System.out.println("\nAfter adding new release (S06):");
        library.showPlaylistAlphabetically();

        System.out.println("\nTotal tracks in library: " + library.getTrackCount());
        System.out.println("================================================================================");
    }
}