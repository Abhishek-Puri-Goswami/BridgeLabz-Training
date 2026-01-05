import java.util.Scanner;

public class LC0198_HouseRobber {

    // Finds maximum money without robbing adjacent houses
    public int rob(int[] nums) {
        int prev1 = 0;
        int prev2 = 0;

        // Choose best option at each house
        for (int num : nums) {
            int curr = Math.max(prev1, prev2 + num);
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0198_HouseRobber sol = new LC0198_HouseRobber();

        System.out.print("Enter number of houses: ");
        int n = input.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter money in houses:");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        System.out.println(sol.rob(nums));

        input.close();
    }
}
