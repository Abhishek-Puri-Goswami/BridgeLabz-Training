import java.util.Scanner;

public class LC0560_SubarraySumEqualsK {

    // Counts number of subarrays whose sum equals k
    public int subarraySum(int[] nums, int k) {
        int count = 0;

        // Try every starting index
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            // Expand subarray from i
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0560_SubarraySumEqualsK sol = new LC0560_SubarraySumEqualsK();

        System.out.print("Enter array size: ");
        int n = input.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        System.out.print("Enter target sum k: ");
        int k = input.nextInt();

        System.out.println(sol.subarraySum(nums, k));

        input.close();
    }
}
