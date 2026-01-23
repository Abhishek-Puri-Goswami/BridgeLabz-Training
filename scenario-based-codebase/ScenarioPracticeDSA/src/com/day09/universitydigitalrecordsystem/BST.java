package com.day09.universitydigitalrecordsystem;

public class BST {
	// root of the tree
	private Node root;

	// constructor (starts with empty tree)
	public BST() {
		root = null;
	}

	// Scenario 1: Insert a new student (by roll number)
	public void insert(Student student) {
		root = insertRec(root, student);
	}

	// recursive helper for insert
	private Node insertRec(Node root, Student student) {
		// if tree is empty, then this becomes new root
		if (root == null) {
			root = new Node(student);
			return root;
		}

		// decide left or right based on roll number
		if (student.getRollNumber().compareTo(root.data.getRollNumber()) < 0) {
			// left subtree
			root.left = insertRec(root.left, student);
		} else if (student.getRollNumber().compareTo(root.data.getRollNumber()) > 0) {
			// right subtree
			root.right = insertRec(root.right, student);
		}
		// if equal, then ignore (as roll numbers are unique)

		return root;
	}

	// Scenario 2: Delete a student by roll number
	public void delete(String rollNumber) {
		root = deleteRec(root, rollNumber);
	}

	// recursive helper for delete
	private Node deleteRec(Node root, String rollNumber) {
		// base case: node not found
		if (root == null) {
			return root;
		}

		// decide left or right based on roll number
		if (rollNumber.compareTo(root.data.getRollNumber()) < 0) {
			// left subtree
			root.left = deleteRec(root.left, rollNumber);
		} else if (rollNumber.compareTo(root.data.getRollNumber()) > 0) {
			// right subtree
			root.right = deleteRec(root.right, rollNumber);
		}
		// found the node to delete
		else {
			// Case 1: leaf node or node with one child
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}

			// Case 2: node with two children
			// Find inorder successor (smallest in right subtree)
			root.data = minValueNode(root.right).data;

			// Delete the inorder successor
			root.right = deleteRec(root.right, root.data.getRollNumber());
		}

		return root;
	}

	// helper: find node with minimum value in subtree
	private Node minValueNode(Node root) {
		Node current = root;
		while (current.left != null) {
			current = current.left;
		}
		return current;
	}

	// Scenario 3: Inorder traversal, then gives sorted list of students
	public void printSorted() {
		System.out.println("-----------------------------------------------------");
		System.out.println("Roll Number  | Name               | Branch     | Year");
		System.out.println("-----------------------------------------------------");
		inorderRec(root);
		System.out.println("-----------------------------------------------------");
	}

	// recursive inorder (Left -> Root -> Right) = sorted order
	private void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.println(root.data);
			inorderRec(root.right);
		}
	}

	// Search for a student by roll number
	public Student search(String rollNumber) {
		Node found = searchRec(root, rollNumber);
		
		return (found != null) ? found.data : null;
	}

	private Node searchRec(Node root, String rollNumber) {
		// if root is null -> return null
		// if root is the match -> return root
		if (root == null || root.data.getRollNumber().equals(rollNumber)) {
			return root;
		}

		// decide left or right based on roll number
		if (rollNumber.compareTo(root.data.getRollNumber()) < 0) {
			// left subtree
			return searchRec(root.left, rollNumber);
		}
		// right subtree
		return searchRec(root.right, rollNumber);
	}
}