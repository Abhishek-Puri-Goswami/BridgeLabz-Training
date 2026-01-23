package com.day09.musicsystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MusicLibraryBST {
	// root node
    private Node root;

    // Constructor (Starts with empty tree)
    public MusicLibraryBST() {
        root = null;
    }

    // Scenario 2: Insert new song
    public void addTrack(Song song) {
        root = insertRec(root, song);
    }

    // Recursive helper method for addTrack
    private Node insertRec(Node current, Song song) {
        if (current == null) {
            return new Node(song);
        }

        // Decide left/right tree to insert
        if (song.getTrackId().compareTo(current.data.getTrackId()) < 0) {
        	// left subtree
            current.left = insertRec(current.left, song);
        } else if (song.getTrackId().compareTo(current.data.getTrackId()) > 0) {
        	// right subtree
            current.right = insertRec(current.right, song);
        }

        return current;
    }

    // Scenario 1: Search by track ID
    public Song searchTrack(String trackId) {
        Node found = searchRec(root, trackId);
        return found != null ? found.data : null;
    }

    // Recursive helper method for searchTrack
    private Node searchRec(Node current, String trackId) {
        if (current == null || current.data.getTrackId().equals(trackId)) {
            return current;
        }

        // Decide left/right tree to search
        if (trackId.compareTo(current.data.getTrackId()) < 0) {
        	// left subtree
            return searchRec(current.left, trackId);
        }
        // right subtree
        return searchRec(current.right, trackId);
    }

    // Scenario 3: Show Playlist Alphabetically by song title
    public void showPlaylistAlphabetically() {
        if (root == null) {
            System.out.println("Library is empty.");
            return;
        }

        // Step 1: collect all songs into a list (any order is fine)
        List<Song> songs = new ArrayList<>();
        collectAll(root, songs);

        // Step 2: sort the list by song title (alphabetical)
        Collections.sort(songs, (s1, s2) -> s1.getTitle().compareToIgnoreCase(s2.getTitle()));

        // Step 3: print sorted list
        System.out.println("Playlist - Sorted Alphabetically by Title");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Track ID     | Title                        | Artist               | Duration");
        System.out.println("--------------------------------------------------------------------------------");

        for (Song song : songs) {
            System.out.println(song);
        }

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Total tracks: " + songs.size());
        System.out.println("--------------------------------------------------------------------------------");
    }

    // Recursive helper method to collect all nodes in any order
    private void collectAll(Node current, List<Song> list) {
        if (current != null) {
            collectAll(current.left, list);
            list.add(current.data);
            collectAll(current.right, list);
        }
    }

    // Method to show sorted by trackId (in-order)
    public void showByTrackId() {
        System.out.println("Tracks sorted by Track ID (BST in-order):");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Track ID     | Title                        | Artist               | Duration");
        System.out.println("--------------------------------------------------------------------------------");
        printInOrder(root);
        System.out.println("--------------------------------------------------------------------------------");
    }

    // Recursive helper method to print as in-order 
    private void printInOrder(Node current) {
        if (current != null) {
            printInOrder(current.left);
            System.out.println(current.data);
            printInOrder(current.right);
        }
    }

    // Count number of songs
    public int getTrackCount() {
        return countNodes(root);
    }

    // Recursive helper method to count nodes for getTrackCount
    private int countNodes(Node current) {
        if (current == null)
            return 0;
        return 1 + countNodes(current.left) + countNodes(current.right);
    }
}