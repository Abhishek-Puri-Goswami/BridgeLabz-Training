import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class LC0232_ImplementStackUsingQueues {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // Push element onto stack
    public void push(int x) {
        q2.add(x);

        // Move all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }

        // Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Removes top element
    public void pop() {
        q1.poll();
    }

    // Returns top element
    public int top() {
        return q1.peek();
    }

    // Checks if stack is empty
    public boolean empty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0232_ImplementStackUsingQueues st = new LC0232_ImplementStackUsingQueues();

        System.out.print("Enter number of operations: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter operation (1 push, 2 pop, 3 top, 4 empty): ");
            int op = input.nextInt();

            if (op == 1) {
                int val = input.nextInt();
                st.push(val);
            } else if (op == 2) {
                st.pop();
            } else if (op == 3) {
                System.out.println(st.top());
            } else if (op == 4) {
                System.out.println(st.empty());
            }
        }

        input.close();
    }
}
