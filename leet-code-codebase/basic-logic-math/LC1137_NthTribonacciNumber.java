import java.util.Scanner;

public class LC1137_NthTribonacciNumber {

    // Returns the n-th Tribonacci number
    public int tribonacci(int n) {

        // Base cases
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        int a = 0;
        int b = 1;
        int c = 1;

        // Build sequence up to n
        for (int i = 3; i <= n; i++) {
            int next = a + b + c;
            a = b;
            b = c;
            c = next;
        }

        return c;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC1137_NthTribonacciNumber sol = new LC1137_NthTribonacciNumber();

        System.out.print("Enter n: ");
        int n = input.nextInt();

        System.out.println(sol.tribonacci(n));

        input.close();
    }
}
    