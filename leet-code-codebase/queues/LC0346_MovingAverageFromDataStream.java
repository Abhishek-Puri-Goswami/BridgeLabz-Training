import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class LC0346_MovingAverageFromDataStream {

    Queue<Integer> queue = new LinkedList<>();
    int size;
    double sum = 0;

    // Constructor
    public LC0346_MovingAverageFromDataStream(int size) {
        this.size = size;
    }

    // Returns moving average
    public double next(int val) {
        queue.add(val);
        sum += val;

        if (queue.size() > size) {
            sum -= queue.poll();
        }

        return sum / queue.size();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter window size: ");
        int k = input.nextInt();

        LC0346_MovingAverageFromDataStream obj = new LC0346_MovingAverageFromDataStream(k);

        System.out.print("Enter number of values: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            int val = input.nextInt();
            System.out.println(obj.next(val));
        }

        input.close();
    }
}
