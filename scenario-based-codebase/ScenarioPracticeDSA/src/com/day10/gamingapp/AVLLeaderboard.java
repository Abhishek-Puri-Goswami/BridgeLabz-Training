package com.day10.gamingapp;

import java.util.ArrayList;
import java.util.List;

public class AVLLeaderboard {
	// root node
    private AVLNode root;

    // constructor
    public AVLLeaderboard() {
        root = null;
    }

    // Get height of node
    private int height(AVLNode node) {
    	// handle null safely
        return (node == null) ? 0 : node.height;
    }

    // Update height after insertion/deletion
    private void updateHeight(AVLNode node) {
        if (node != null) {
            node.height = 1 + Math.max(height(node.left), height(node.right));
        }
    }

    // Get balance factor
    private int getBalance(AVLNode node) {
        return (node == null) ? 0 : height(node.left) - height(node.right);
    }

    // Right rotate (for left-heavy cases)
    private AVLNode rightRotate(AVLNode y) {
        AVLNode x = y.left;
        AVLNode T2 = x.right;

        x.right = y;
        y.left = T2;

        updateHeight(y);
        updateHeight(x);

        return x;
    }

    // Left rotate (for right-heavy cases)
    private AVLNode leftRotate(AVLNode x) {
        AVLNode y = x.right;
        AVLNode T2 = y.left;

        y.left = x;
        x.right = T2;

        updateHeight(x);
        updateHeight(y);

        return y;
    }

    // Scenario 1: Insert or update player score
    public void insertOrUpdate(Player player) {
        root = insertRec(root, player);
    }

    private AVLNode insertRec(AVLNode node, Player player) {
        if (node == null) {
            return new AVLNode(player);
        }

        // Compare by score DESCENDING + playerId for stability
        int cmp = Integer.compare(player.getScore(), node.player.getScore());
        if (cmp > 0 || (cmp == 0 && player.getPlayerId().compareTo(node.player.getPlayerId()) < 0)) {
            node.left = insertRec(node.left, player);
        } else if (cmp < 0 || (cmp == 0 && player.getPlayerId().compareTo(node.player.getPlayerId()) > 0)) {
            node.right = insertRec(node.right, player);
        } else {
            // Same playerId → update score
            node.player.updateScore(player.getScore() - node.player.getScore());
            return node; // no need to re-balance if only value changed
        }

        // Update height
        updateHeight(node);

        // Rebalance
        int balance = getBalance(node);

        // Left Left
        if (balance > 1 && player.getScore() > node.left.player.getScore()) {
            return rightRotate(node);
        }
        // Left Right
        if (balance > 1 && player.getScore() < node.left.player.getScore()) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        // Right Right
        if (balance < -1 && player.getScore() < node.right.player.getScore()) {
            return leftRotate(node);
        }
        // Right Left
        if (balance < -1 && player.getScore() > node.right.player.getScore()) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Scenario 3: Remove player (ban / exit)
    public void remove(String playerId) {
        root = removeRec(root, playerId);
    }

    private AVLNode removeRec(AVLNode node, String playerId) {
        if (node == null) {
            return node;
        }

        int cmp = playerId.compareTo(node.player.getPlayerId());

        if (cmp < 0) {
            node.left = removeRec(node.left, playerId);
        } else if (cmp > 0) {
            node.right = removeRec(node.right, playerId);
        } else {
            // Node found - delete it
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }

            // Node with two children: get in-order successor
            AVLNode temp = minValueNode(node.right);
            node.player = temp.player;
            node.right = removeRec(node.right, temp.player.getPlayerId());
        }

        updateHeight(node);
        int balance = getBalance(node);

        // Rebalance after deletion
        if (balance > 1 && getBalance(node.left) >= 0) {
            return rightRotate(node);
        }
        if (balance > 1 && getBalance(node.left) < 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if (balance < -1 && getBalance(node.right) <= 0) {
            return leftRotate(node);
        }
        if (balance < -1 && getBalance(node.right) > 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    private AVLNode minValueNode(AVLNode node) {
        AVLNode current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    // Scenario 2: Display top N players (highest score first)
    public void showTopPlayers(int n) {
    	System.out.println("---------------------------------------------------------------");
        System.out.println("Rank | Player ID       | Username           | Score    | Region");
        System.out.println("---------------------------------------------------------------");

        List<Player> top = new ArrayList<>();
        collectDescending(root, top, n);

        int rank = 1;
        for (Player p : top) {
            System.out.printf("%-4d | %s\n", rank++, p);
        }

        System.out.println("---------------------------------------------------------------");
    }

    // In-order traversal but reversed (right -> root -> left) = descending score
    private void collectDescending(AVLNode node, List<Player> list, int limit) {
        if (node == null || list.size() >= limit)
            return;

        collectDescending(node.right, list, limit); // higher scores first
        if (list.size() < limit) {
            list.add(node.player);
        }
        collectDescending(node.left, list, limit);
    }

    public int getPlayerCount() {
        return countNodes(root);
    }

    private int countNodes(AVLNode node) {
        if (node == null)
            return 0;
        return 1 + countNodes(node.left) + countNodes(node.right);
    }
}