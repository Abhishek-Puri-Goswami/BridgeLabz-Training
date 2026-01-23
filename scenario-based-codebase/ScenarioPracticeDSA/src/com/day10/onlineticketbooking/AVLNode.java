package com.day10.onlineticketbooking;

// Node for AVL Tree (self-balancing BST -> AVL)
class AVLNode {
    Event event;
    AVLNode left;
    AVLNode right;
    int height;

    public AVLNode(Event event) {
        this.event = event;
        this.left = null;
        this.right = null;
        this.height = 1;
    }
}