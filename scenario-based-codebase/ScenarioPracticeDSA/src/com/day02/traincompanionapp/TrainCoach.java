package com.day02.traincompanionapp;

// Doubly Linked List representing train compartments in sequence
public class TrainCoach {
	// first compartment
	private Compartment head;
	// last compartment
	private Compartment tail;

	public TrainCoach() {
		head = null;
		tail = null;
	}

	// Add compartment at the end
	public void addCompartment(String type, String description) {
		Compartment newComp = new Compartment(type, description);

		if (head == null) {
			head = newComp;
			tail = newComp;
			return;
		}

		tail.next = newComp;
		newComp.prev = tail;
		tail = newComp;
	}

	// Insert a compartment after a given type
	public boolean insertAfter(String afterType, String newType, String description) {
		Compartment current = head;

		while (current != null) {
			if (current.type.equalsIgnoreCase(afterType)) {
				Compartment newComp = new Compartment(newType, description);

				newComp.next = current.next;
				newComp.prev = current;

				if (current.next != null) {
					current.next.prev = newComp;
				} else {
					// inserted at end
					tail = newComp; 
				}

				current.next = newComp;
				return true;
			}
			current = current.next;
		}
		return false;
	}

	// Remove a compartment
	public boolean removeCompartment(String type) {
		Compartment current = head;

		while (current != null) {
			if (current.type.equalsIgnoreCase(type)) {
				// Case 1: Only one node
				if (current == head && current == tail) {
					head = null;
					tail = null;
				}
				// Case 2: Remove head
				else if (current == head) {
					head = head.next;
					head.prev = null;
				}
				// Case 3: Remove tail
				else if (current == tail) {
					tail = tail.prev;
					tail.next = null;
				}
				// Case 4: Remove in middle
				else {
					current.prev.next = current.next;
					current.next.prev = current.prev;
				}
				return true;
			}
			current = current.next;
		}
		return false;
	}

	// Move forward from current position
	public Compartment moveForward(Compartment current) {
		if (current == null || current.next == null) {
			return null;
		}
		return current.next;
	}

	// Move backward from current position
	public Compartment moveBackward(Compartment current) {
		if (current == null || current.prev == null) {
			return null;
		}
		return current.prev;
	}

	// Find nearest service of given type from current position
	public Compartment findNearestService(Compartment current, String serviceType) {
		if (current == null)
			return null;

		// Search forward first
		Compartment temp = current;
		while (temp != null) {
			if (temp.type.equalsIgnoreCase(serviceType)) {
				return temp;
			}
			temp = temp.next;
		}

		// Then backward
		temp = current.prev;
		while (temp != null) {
			if (temp.type.equalsIgnoreCase(serviceType)) {
				return temp;
			}
			temp = temp.prev;
		}

		return null;
	}

	// Show compartments around current position (previous, current, next)
	public void showNearby(Compartment current) {
		if (current == null) {
			System.out.println("=> No current position.");
			return;
		}

		System.out.println("=> Nearby compartments:");
		if (current.prev != null) {
			System.out.println("Previous -> " + current.prev.getInfo());
		}
		System.out.println("Current  -> " + current.getInfo());
		if (current.next != null) {
			System.out.println("Next     -> " + current.next.getInfo());
		}
		System.out.println();
	}

	// Print complete coach composition
	public void printTrain() {
		if (head == null) {
			System.out.println("Train is empty.");
			return;
		}

		Compartment temp = head;
		System.out.print("Engine -> ");
		while (temp != null) {
			System.out.print(temp.type + " ");
			temp = temp.next;
		}
		System.out.println(" <- Guard");
	}
	
	// method to find starting compartment by type
	static Compartment findCompartment(TrainCoach train, String type) {
		Compartment temp = train.head;
		while (temp != null) {
			if (temp.type.equalsIgnoreCase(type)) {
				return temp;
			}
			temp = temp.next;
		}
		return null;
	}
}