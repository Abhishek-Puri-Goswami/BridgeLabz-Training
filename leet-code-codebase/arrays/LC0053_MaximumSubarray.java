import java.util.Scanner;

public class LC0053_MaximumSubarray {

    // Finds maximum sum of a contiguous subarray
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        // Kadane’s Algorithm
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0053_MaximumSubarray sol = new LC0053_MaximumSubarray();

        System.out.print("Enter array size: ");
        int n = input.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        System.out.println(sol.maxSubArray(nums));

        input.close();
    }
}