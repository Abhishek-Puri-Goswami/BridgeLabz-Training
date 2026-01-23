import java.util.Scanner;
import java.util.Stack;

public class LC0739_DailyTemperatures {

    // Finds how many days to wait for a warmer temperature
    public int[] dailyTemperatures(int[] temps) {
        int n = temps.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Use stack to store indexes
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temps[i] > temps[stack.peek()]) {
                int prevIndex = stack.pop();
                result[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0739_DailyTemperatures sol = new LC0739_DailyTemperatures();

        System.out.print("Enter number of days: ");
        int n = input.nextInt();

        int[] temps = new int[n];
        System.out.println("Enter temperatures:");
        for (int i = 0; i < n; i++) {
            temps[i] = input.nextInt();
        }

        int[] result = sol.dailyTemperatures(temps);

        for (int val : result) {
            System.out.print(val + " ");
        }

        input.close();
    }
}
