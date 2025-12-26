import java.util.*;

public class LC0414_ThirdMaximumNumber {

    public int thirdMax(int[] nums) {
        long firstMax = Long.MIN_VALUE;
        long secMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        for (int num : nums) {
            if (num > firstMax) {
                thirdMax = secMax;
                secMax = firstMax;
                firstMax = num;
            } else if (num > secMax && num < firstMax) {
                thirdMax = secMax;
                secMax = num;
            } else if (num > thirdMax && num < secMax) {
                thirdMax = num;
            }
        }

        return thirdMax != Long.MIN_VALUE ? (int) thirdMax : (int) firstMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LC0414_ThirdMaximumNumber sol = new LC0414_ThirdMaximumNumber();

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = sol.thirdMax(nums);

        System.out.println("Third maximum number (or maximum if less than 3 unique): " + result);
    }
}
