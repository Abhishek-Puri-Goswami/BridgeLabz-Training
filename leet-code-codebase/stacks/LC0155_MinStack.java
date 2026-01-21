import java.util.Scanner;
import java.util.Stack;

public class LC0155_MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    // Push element onto stack
    public void push(int val) {
        stack.push(val);

        // Keep track of minimum
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    // Removes top element
    public void pop() {
        if (stack.isEmpty())
            return;

        int removed = stack.pop();

        if (removed == minStack.peek()) {
            minStack.pop();
        }
    }

    // Returns top element
    public int top() {
        return stack.peek();
    }

    // Returns minimum element
    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0155_MinStack ms = new LC0155_MinStack();

        System.out.print("Enter number of operations: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter operation (1 push, 2 pop, 3 top, 4 min): ");
            int op = input.nextInt();

            if (op == 1) {
                int val = input.nextInt();
                ms.push(val);
            } else if (op == 2) {
                ms.pop();
            } else if (op == 3) {
                System.out.println(ms.top());
            } else if (op == 4) {
                System.out.println(ms.getMin());
            }
        }

        input.close();
    }
}
