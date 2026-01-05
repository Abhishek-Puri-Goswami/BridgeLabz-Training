import java.util.Scanner;

public class LC0747_ClimbingStairsVariant {

    // Returns number of ways to climb stairs
    public int climbStairs(int n) {
        if (n <= 2) return n;

        int a = 1, b = 2;

        // Extend previous results
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0747_ClimbingStairsVariant sol = new LC0747_ClimbingStairsVariant();

        System.out.print("Enter number of stairs: ");
        int n = input.nextInt();

        System.out.println(sol.climbStairs(n));

        input.close();
    }
}
