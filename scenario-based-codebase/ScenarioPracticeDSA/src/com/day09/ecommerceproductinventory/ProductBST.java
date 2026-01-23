package com.day09.ecommerceproductinventory;

public class ProductBST {
    private Node root;

    // constructor (starts with empty tree)
    public ProductBST() {
        root = null;
    }

    // Scenario 1: Lookup — search product by SKU
    public Product lookup(String sku) {
        Node found = searchRec(root, sku);
        return (found != null) ? found.data : null;
    }

    // Recursive helper method for lookup method
    private Node searchRec(Node root, String sku) {
        if (root == null || root.data.getSku().equals(sku)) {
            return root;
        }

        // left subtree
        if (sku.compareTo(root.data.getSku()) < 0) {
            return searchRec(root.left, sku);
        }
        // right subtree
        return searchRec(root.right, sku);
    }

    // Insert a new product
    public void insert(Product product) {
        root = insertRec(root, product);
    }

    // Recursive helper method for insert method
    private Node insertRec(Node root, Product product) {
        if (root == null) {
            return new Node(product);
        }

        // Decide left/right subtree to insert
        if (product.getSku().compareTo(root.data.getSku()) < 0) {
        	// left subtree
            root.left = insertRec(root.left, product);
        } else if (product.getSku().compareTo(root.data.getSku()) > 0) {
        	// right subtree
            root.right = insertRec(root.right, product);
        }

        return root;
    }

    // Scenario 2: Price Update — find by SKU and update price
    public boolean updatePrice(String sku, double newPrice) {
        Node node = searchRec(root, sku);
        if (node != null) {
            node.data.setPrice(newPrice);
            return true;
        }
        return false;
    }

    // Scenario 3: Sorted List — display all products in SKU order
    public void printSorted() {
    	System.out.println("-----------------------------------------------------------------");
        System.out.println("SKU          | Product Name              | Price      | Stock");
        System.out.println("-----------------------------------------------------------------");
        inorderRec(root);
        System.out.println("-----------------------------------------------------------------");
    }

    // Inorder traversal = sorted order (Left -> Root -> Right)
    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.data);
            inorderRec(root.right);
        }
    }

    // Method to count products
    public int getProductCount() {
        return countNodes(root);
    }
    
    // Recursive helper method for getProductCount method
    private int countNodes(Node root) {
        if (root == null)
            return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}