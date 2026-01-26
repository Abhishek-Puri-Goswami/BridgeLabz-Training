import java.util.Scanner;

public class LC0622_DesignCircularQueue {

    int[] queue;
    int front;
    int rear;
    int size;
    int capacity;

    // Constructor
    public LC0622_DesignCircularQueue(int k) {
        queue = new int[k];
        capacity = k;
        front = 0;
        rear = -1;
        size = 0;
    }

    // Inserts element into the circular queue
    public boolean enQueue(int value) {
        if (isFull())
            return false;

        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
        return true;
    }

    // Deletes element from the circular queue
    public boolean deQueue() {
        if (isEmpty())
            return false;

        front = (front + 1) % capacity;
        size--;
        return true;
    }

    // Gets front element
    public int Front() {
        if (isEmpty())
            return -1;
        return queue[front];
    }

    // Gets rear element
    public int Rear() {
        if (isEmpty())
            return -1;
        return queue[rear];
    }

    // Checks if queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Checks if queue is full
    public boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter capacity: ");
        int k = input.nextInt();

        LC0622_DesignCircularQueue cq = new LC0622_DesignCircularQueue(k);

        System.out.print("Enter number of operations: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter operation (1 enQ, 2 deQ, 3 front, 4 rear, 5 empty, 6 full): ");
            int op = input.nextInt();

            if (op == 1) {
                int val = input.nextInt();
                System.out.println(cq.enQueue(val));
            } else if (op == 2) {
                System.out.println(cq.deQueue());
            } else if (op == 3) {
                System.out.println(cq.Front());
            } else if (op == 4) {
                System.out.println(cq.Rear());
            } else if (op == 5) {
                System.out.println(cq.isEmpty());
            } else if (op == 6) {
                System.out.println(cq.isFull());
            }
        }

        input.close();
    }
}
