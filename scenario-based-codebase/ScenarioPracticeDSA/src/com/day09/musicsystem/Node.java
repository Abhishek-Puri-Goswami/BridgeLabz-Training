package com.day09.musicsystem;

// One node of the Binary Search Tree
public class Node {
	// the song record
	Song data;

	// smaller track IDs
	Node left;

	// larger track IDs
	Node right;

	// constructor
	public Node(Song song) {
		this.data = song;
		this.left = null;
		this.right = null;
	}
}