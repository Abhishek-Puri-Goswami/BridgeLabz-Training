import java.util.Scanner;

public class LC0485_MaxConsecutiveOnes {

    // Finds the maximum number of consecutive 1s
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;

        // Count continuous 1s
        for (int num : nums) {
            if (num == 1) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0485_MaxConsecutiveOnes sol = new LC0485_MaxConsecutiveOnes();

        System.out.print("Enter array size: ");
        int n = input.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter binary array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        System.out.println(sol.findMaxConsecutiveOnes(nums));

        input.close();
    }
}
