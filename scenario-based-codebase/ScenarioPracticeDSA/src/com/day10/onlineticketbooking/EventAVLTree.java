package com.day10.onlineticketbooking;

public class EventAVLTree {
	// root node
	private AVLNode root;

	// constructor
	public EventAVLTree() {
		root = null;
	}

	// helper method to get height
	private int height(AVLNode node) {
		return node == null ? 0 : node.height;
	}

	// Update node height
	private void updateHeight(AVLNode node) {
		if (node != null) {
			node.height = 1 + Math.max(height(node.left), height(node.right));
		}
	}

	// Get balance factor
	private int getBalance(AVLNode node) {
		return node == null ? 0 : height(node.left) - height(node.right);
	}

	// Right rotation
	private AVLNode rightRotate(AVLNode y) {
		AVLNode x = y.left;
		AVLNode T2 = x.right;

		x.right = y;
		y.left = T2;

		updateHeight(y);
		updateHeight(x);

		return x;
	}

	// Left rotation
	private AVLNode leftRotate(AVLNode x) {
		AVLNode y = x.right;
		AVLNode T2 = y.left;

		y.left = x;
		x.right = T2;

		updateHeight(x);
		updateHeight(y);

		return y;
	}

	// Scenario 1: Insert new event (by start time)
	public void addEvent(Event event) {
		root = insertRec(root, event);
	}

	private AVLNode insertRec(AVLNode node, Event event) {
		if (node == null) {
			return new AVLNode(event);
		}

		// Compare start time first, then eventId if times equal
		int timeCmp = event.getStartTime().compareTo(node.event.getStartTime());
		int idCmp = event.getEventId().compareTo(node.event.getEventId());

		if (timeCmp < 0 || (timeCmp == 0 && idCmp < 0)) {
			// left subtree
			node.left = insertRec(node.left, event);
		} else if (timeCmp > 0 || (timeCmp == 0 && idCmp > 0)) {
			// right subtree
			node.right = insertRec(node.right, event);
		} else {

			return node;
		}

		updateHeight(node);

		// Rebalance
		int balance = getBalance(node);

		// Left Left
		if (balance > 1 && event.getStartTime().compareTo(node.left.event.getStartTime()) <= 0) {
			return rightRotate(node);
		}
		// Left Right
		if (balance > 1 && event.getStartTime().compareTo(node.left.event.getStartTime()) > 0) {
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}
		// Right Right
		if (balance < -1 && event.getStartTime().compareTo(node.right.event.getStartTime()) >= 0) {
			return leftRotate(node);
		}
		// Right Left
		if (balance < -1 && event.getStartTime().compareTo(node.right.event.getStartTime()) < 0) {
			node.right = rightRotate(node.right);
			return leftRotate(node);
		}

		return node;
	}

	// Scenario 2: Cancel / delete event by eventId
	public void cancelEvent(String eventId) {
		root = deleteRec(root, eventId);
	}

	// Recursive helper method to cancel event
	private AVLNode deleteRec(AVLNode node, String eventId) {
		if (node == null) {
			return node;
		}

		int cmp = eventId.compareTo(node.event.getEventId());

		if (cmp < 0) {
			// left subtree
			node.left = deleteRec(node.left, eventId);
		} else if (cmp > 0) {
			// right subtree
			node.right = deleteRec(node.right, eventId);
		} else {
			// Found -> delete
			if (node.left == null)
				return node.right;
			if (node.right == null)
				return node.left;

			// Two children: replace with inorder successor
			AVLNode temp = minNode(node.right);
			node.event = temp.event;
			node.right = deleteRec(node.right, temp.event.getEventId());
		}

		updateHeight(node);
		int balance = getBalance(node);

		// Rebalance after delete
		if (balance > 1 && getBalance(node.left) >= 0)
			return rightRotate(node);
		if (balance > 1 && getBalance(node.left) < 0) {
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}
		if (balance < -1 && getBalance(node.right) <= 0)
			return leftRotate(node);
		if (balance < -1 && getBalance(node.right) > 0) {
			node.right = rightRotate(node.right);
			return leftRotate(node);
		}

		return node;
	}

	private AVLNode minNode(AVLNode node) {
		while (node.left != null) {
			node = node.left;
		}
		return node;
	}

	// Scenario 3: Show upcoming events in chronological order
	public void showUpcomingEvents() {
		if (root == null) {
			System.out.println("No upcoming events.");
			return;
		}

		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println(				"Event ID         | Event Name           | Start Time       | Venue             | Tickets");
		System.out.println("-------------------------------------------------------------------------------------------");
		printInOrder(root);
		System.out.println("-------------------------------------------------------------------------------------------");
	}

	// In-order traversal = chronological order
	private void printInOrder(AVLNode node) {
		if (node != null) {
			printInOrder(node.left);
			System.out.println(node.event);
			printInOrder(node.right);
		}
	}

	// Method to count events
	public int getEventCount() {
		return count(root);
	}

	// helper method to count events
	private int count(AVLNode node) {
		if (node == null)
			return 0;
		return 1 + count(node.left) + count(node.right);
	}
}