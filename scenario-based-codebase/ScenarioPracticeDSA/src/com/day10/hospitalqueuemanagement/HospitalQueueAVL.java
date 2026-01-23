package com.day10.hospitalqueuemanagement;

public class HospitalQueueAVL {
	// root node
    private AVLNode root;

    // constructor
    public HospitalQueueAVL() {
        root = null;
    }

    // Method to get height
    private int height(AVLNode node) {
        return node == null ? 0 : node.height;
    }

    // Method to update height
    private void updateHeight(AVLNode node) {
        if (node != null) {
            node.height = 1 + Math.max(height(node.left), height(node.right));
        }
    }

    // Helper method to get height factor
    private int getBalance(AVLNode node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    // right rotation
    private AVLNode rightRotate(AVLNode y) {
        AVLNode x = y.left;
        AVLNode T2 = x.right;
        x.right = y;
        y.left = T2;
        updateHeight(y);
        updateHeight(x);
        return x;
    }

    // left rotation
    private AVLNode leftRotate(AVLNode x) {
        AVLNode y = x.right;
        AVLNode T2 = y.left;
        y.left = x;
        x.right = T2;
        updateHeight(x);
        updateHeight(y);
        return y;
    }

    // Scenario 1: Patient Registration (insert by check-in time)
    public void registerPatient(Patient patient) {
        root = insertRec(root, patient);
    }

    // Recursive helper method for insert
    private AVLNode insertRec(AVLNode node, Patient patient) {
        if (node == null) {
            return new AVLNode(patient);
        }

        // Primary: earlier time first
        // Secondary: patientId (stable order when times are equal)
        int timeCmp = patient.getCheckInTime().compareTo(node.patient.getCheckInTime());
        int idCmp = patient.getPatientId().compareTo(node.patient.getPatientId());

        // Decide left / right tree
        if (timeCmp < 0 || (timeCmp == 0 && idCmp < 0)) {
        	// left subtree
            node.left = insertRec(node.left, patient);
        } else if (timeCmp > 0 || (timeCmp == 0 && idCmp > 0)) {
        	// right subtree
            node.right = insertRec(node.right, patient);
        } else {
            return node;
        }

        updateHeight(node);

        // Rebalance tree
        int balance = getBalance(node);

        if (balance > 1 && patient.getCheckInTime().compareTo(node.left.patient.getCheckInTime()) <= 0)
            return rightRotate(node);

        if (balance > 1 && patient.getCheckInTime().compareTo(node.left.patient.getCheckInTime()) > 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && patient.getCheckInTime().compareTo(node.right.patient.getCheckInTime()) >= 0)
            return leftRotate(node);

        if (balance < -1 && patient.getCheckInTime().compareTo(node.right.patient.getCheckInTime()) < 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Scenario 2: Discharge / Delete patient record
    public void dischargePatient(String patientId) {
        root = deleteRec(root, patientId);
    }

    // Recursive helper method for delete 
    private AVLNode deleteRec(AVLNode node, String patientId) {
        if (node == null) return node;

        int cmp = patientId.compareTo(node.patient.getPatientId());

        // Decide left / right tree
        if (cmp < 0)
        	// left subtree
            node.left = deleteRec(node.left, patientId);
        else if (cmp > 0)
        	// right subtree
            node.right = deleteRec(node.right, patientId);
        else {
            // found 
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;

            // two children -> replace with successor
            AVLNode temp = minNode(node.right);
            node.patient = temp.patient;
            node.right = deleteRec(node.right, temp.patient.getPatientId());
        }

        updateHeight(node);
        int balance = getBalance(node);

        if (balance > 1 && getBalance(node.left) >= 0) return rightRotate(node);
        if (balance > 1 && getBalance(node.left) < 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if (balance < -1 && getBalance(node.right) <= 0) return leftRotate(node);
        if (balance < -1 && getBalance(node.right) > 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // find the minimum value node
    private AVLNode minNode(AVLNode node) {
        while (node.left != null) node = node.left;
        return node;
    }

    // Scenario 3: Display patients in order of arrival (earliest first)
    public void displayQueue() {
        if (root == null) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Patient ID     | Name               | Check-in Time      | Department   | Condition");
        System.out.println("-------------------------------------------------------------------------------------");

        printInOrder(root);

        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Total patients waiting: " + count(root));
    }

    // Method to print sorted (inorder)
    private void printInOrder(AVLNode node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.println(node.patient);
            printInOrder(node.right);
        }
    }

    // Helper method to count nodes
    private int count(AVLNode node) {
        if (node == null) return 0;
        return 1 + count(node.left) + count(node.right);
    }
}