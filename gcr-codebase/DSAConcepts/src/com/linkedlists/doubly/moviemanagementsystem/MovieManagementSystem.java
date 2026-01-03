package com.linkedlists.doubly.moviemanagementsystem;

public class MovieManagementSystem {

    public static void main(String[] args) {

        MovieDoublyLinkedList list = new MovieDoublyLinkedList();

        list.addFirst("Inception", "Christopher Nolan", 2010, 8.8);
        list.addLast("Interstellar", "Christopher Nolan", 2014, 8.6);
        list.addLast("Titanic", "James Cameron", 1997, 7.8);

        list.addAtPosition(1, "Avatar", "James Cameron", 2009, 7.9);

        System.out.println("Movies (Forward):");
        list.displayForward();

        System.out.println("Movies (Reverse):");
        list.displayReverse();

        System.out.println("Search by Director: James Cameron");
        list.searchByDirector("James Cameron");

        System.out.println("Update Rating for Titanic:");
        list.updateRating("Titanic", 8.0);
        System.out.println("--------------------------");
        
        System.out.println("Remove Movie: Avatar");
        list.removeByTitle("Avatar");
        System.out.println("--------------------------");

        System.out.println("Final Movie List:");
        list.displayForward();
    }
}
