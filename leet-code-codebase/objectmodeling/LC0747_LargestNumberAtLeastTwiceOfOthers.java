import java.util.Scanner;

public class LC0747_LargestNumberAtLeastTwiceOfOthers {

    // Finds index of largest number if it is twice of others
    public int dominantIndex(int[] nums) {
        int max = -1, secondMax = -1, index = -1;

        // Track largest and second largest
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
                index = i;
            } else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }

        return max >= 2 * secondMax ? index : -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0747_LargestNumberAtLeastTwiceOfOthers sol = new LC0747_LargestNumberAtLeastTwiceOfOthers();

        System.out.print("Enter array size: ");
        int n = input.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        System.out.println(sol.dominantIndex(nums));

        input.close();
    }
}
