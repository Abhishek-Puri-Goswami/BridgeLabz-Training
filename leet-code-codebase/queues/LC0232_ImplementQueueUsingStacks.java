import java.util.Scanner;
import java.util.Stack;

public class LC0232_ImplementQueueUsingStacks {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // Push element to the back of queue
    public void push(int x) {
        s1.push(x);
    }

    // Removes element from front of queue
    public int pop() {
        peek();
        return s2.pop();
    }

    // Gets the front element
    public int peek() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    // Checks if queue is empty
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0232_ImplementQueueUsingStacks q = new LC0232_ImplementQueueUsingStacks();

        System.out.print("Enter number of operations: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter operation (1 push, 2 pop, 3 peek, 4 empty): ");
            int op = input.nextInt();

            if (op == 1) {
                int val = input.nextInt();
                q.push(val);
            } else if (op == 2) {
                System.out.println(q.pop());
            } else if (op == 3) {
                System.out.println(q.peek());
            } else if (op == 4) {
                System.out.println(q.empty());
            }
        }

        input.close();
    }
}
