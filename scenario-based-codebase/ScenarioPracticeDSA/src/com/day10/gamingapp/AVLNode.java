package com.day10.gamingapp;

// Node for AVL Tree
class AVLNode {
    Player player;
    AVLNode left;
    AVLNode right;
    int height; // height of this subtree (for balancing)

    public AVLNode(Player player) {
        this.player = player;
        this.left = null;
        this.right = null;
        this.height = 1;
    }
}