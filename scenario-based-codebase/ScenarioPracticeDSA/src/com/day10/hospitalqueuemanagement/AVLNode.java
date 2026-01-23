package com.day10.hospitalqueuemanagement;

// Node structure for AVL Tree
class AVLNode {
    Patient patient;
    AVLNode left;
    AVLNode right;
    int height;

    // constructor
    public AVLNode(Patient patient) {
        this.patient = patient;
        this.left = null;
        this.right = null;
        this.height = 1;
    }
}