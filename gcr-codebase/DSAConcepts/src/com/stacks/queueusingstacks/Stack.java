package com.stacks.queueusingstacks;

public class Stack {

    private int[] arr;
    private int top;
    private int capacity;

    // Initializes stack with given size
    public Stack(int size) {
        capacity = size;
        arr = new int[size];
        top = -1;
    }

    // Pushes element into stack
    public void push(int data) {
        if (top == capacity - 1) {
            System.out.println("Stack overflow");
            return;
        }
        arr[++top] = data;
    }

    // Pops element from stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[top--];
    }

    // Returns top element without removing
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return arr[top];
    }

    // Checks if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }
}
