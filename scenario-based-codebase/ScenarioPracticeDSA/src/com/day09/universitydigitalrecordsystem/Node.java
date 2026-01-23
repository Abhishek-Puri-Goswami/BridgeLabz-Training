package com.day09.universitydigitalrecordsystem;

// One node of the Binary Search Tree
public class Node {
	// the student record
	Student data;
	
	// left child (smaller roll numbers)
	Node left;
	
	// right child (larger roll numbers)
	Node right;

	// constructor
	public Node(Student student) {
		this.data = student;
		this.left = null;
		this.right = null;
	}
}