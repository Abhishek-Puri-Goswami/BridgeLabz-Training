package com.linkedlists.singly.socialmediafriendconnections;

public class SocialMediaFriendConnections {

    public static void main(String[] args) {

        SocialMediaLinkedList network = new SocialMediaLinkedList();

        network.addUser(1, "Divyansh", 22);
        network.addUser(2, "Akshat", 21);
        network.addUser(3, "Abhishek", 23);
        network.addUser(4, "Hariom", 20);

        network.addFriendConnection(1, 2);
        network.addFriendConnection(1, 3);
        network.addFriendConnection(2, 3);
        network.addFriendConnection(2, 4);

        System.out.println("Friends of User 2:");
        network.displayFriends(2);

        System.out.println("------------");
        System.out.println("Mutual Friends of 1 and 2:");
        network.findMutualFriends(1, 2);

        System.out.println("------------");
        System.out.println("Remove Friend Connection (1 & 3):");
        network.removeFriendConnection(1, 3);

        System.out.println("------------");
        System.out.println("Friends of User 1:");
        network.displayFriends(1);

        System.out.println("------------");
        System.out.println("Search User by Name:");
        network.searchUserByName("Meena");

        System.out.println("------------");
        System.out.println("Friend Count:");
        network.countFriends();
    }
}
