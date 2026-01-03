package com.linkedlists.doubly.moviemanagementsystem;

public class MovieDoublyLinkedList {

    private MovieNode head;
    private MovieNode tail;

    // Add movie at start
    public void addFirst(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Add movie at end
    public void addLast(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (tail == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Add movie at specific position (0-based index)
    public void addAtPosition(int index, String title, String director, int year, double rating) {

        if (index < 0) {
            System.out.println("Invalid index.");
            return;
        }

        if (index == 0) {
        	addFirst(title, director, year, rating);
            return;
        }

        MovieNode temp = head;
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Index out of bounds.");
            return;
        }

        MovieNode newNode = new MovieNode(title, director, year, rating);

        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        } else {
            tail = newNode;
        }

        temp.next = newNode;
    }

    // Remove movie by title
    public void removeByTitle(String title) {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        MovieNode temp = head;

        while (temp != null && !temp.title.equalsIgnoreCase(title)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Movie not found.");
            return;
        }

        if (temp == head) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
        } else if (temp == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }

    // Search movies by director
    public void searchByDirector(String director) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movies found for this director.");
        }
    }

    // Search movies by rating
    public void searchByRating(double rating) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.rating == rating) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movies found with this rating.");
        }
    }

    // Update rating by movie title
    public void updateRating(String title, double newRating) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated successfully.");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Movie not found.");
    }

    // Display movies forward
    public void displayForward() {

        if (head == null) {
            System.out.println("No movies available.");
            return;
        }

        MovieNode temp = head;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.next;
        }
    }

    // Display movies in reverse
    public void displayReverse() {

        if (tail == null) {
            System.out.println("No movies available.");
            return;
        }

        MovieNode temp = tail;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.prev;
        }
    }

    // Method to display a movie
    private void displayMovie(MovieNode node) {
        System.out.println("Title    : " + node.title);
        System.out.println("Director : " + node.director);
        System.out.println("Year     : " + node.releaseYear);
        System.out.println("Rating   : " + node.rating);
        System.out.println("---------------------------");
    }
}
