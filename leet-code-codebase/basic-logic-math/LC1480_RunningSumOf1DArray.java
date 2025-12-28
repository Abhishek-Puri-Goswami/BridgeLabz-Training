import java.util.Scanner;

public class LC1480_RunningSumOf1DArray {

    // Computes running sum of the given array
    public int[] runningSum(int[] nums) {

        // Add previous sum to current element
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }

        return nums;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC1480_RunningSumOf1DArray sol = new LC1480_RunningSumOf1DArray();

        System.out.print("Enter array size: ");
        int n = input.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        int[] result = sol.runningSum(nums);

        System.out.println("Running sum array:");
        for (int val : result) {
            System.out.print(val + " ");
        }

        input.close();
    }
}
