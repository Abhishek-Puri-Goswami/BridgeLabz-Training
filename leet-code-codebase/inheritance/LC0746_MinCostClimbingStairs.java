import java.util.Scanner;

public class LC0746_MinCostClimbingStairs {

    // Finds minimum cost to reach the top
    public int minCostClimbingStairs(int[] cost) {
        int prev1 = 0;
        int prev2 = 0;

        // Build solution step by step
        for (int i = 0; i < cost.length; i++) {
            int curr = cost[i] + Math.min(prev1, prev2);
            prev2 = prev1;
            prev1 = curr;
        }

        return Math.min(prev1, prev2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0746_MinCostClimbingStairs sol = new LC0746_MinCostClimbingStairs();

        System.out.print("Enter array size: ");
        int n = input.nextInt();

        int[] cost = new int[n];
        System.out.println("Enter cost values:");
        for (int i = 0; i < n; i++) {
            cost[i] = input.nextInt();
        }

        System.out.println(sol.minCostClimbingStairs(cost));

        input.close();
    }
}
