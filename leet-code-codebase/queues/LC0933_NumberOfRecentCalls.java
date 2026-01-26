import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class LC0933_NumberOfRecentCalls {

    Queue<Integer> queue = new LinkedList<>();

    // Adds a request and returns number of requests in last 3000 ms
    public int ping(int t) {
        queue.add(t);

        // Remove old requests
        while (queue.peek() < t - 3000) {
            queue.poll();
        }

        return queue.size();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0933_NumberOfRecentCalls recent = new LC0933_NumberOfRecentCalls();

        System.out.print("Enter number of pings: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            int t = input.nextInt();
            System.out.println(recent.ping(t));
        }

        input.close();
    }
}
