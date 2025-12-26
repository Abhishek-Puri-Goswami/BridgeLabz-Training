import java.util.*;

public class LC0268_MissingNumber {

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int actSum = 0, reqSum = n * (n + 1) / 2;

        for (int num : nums) {
            actSum += num;
        }

        return (reqSum - actSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LC0268_MissingNumber sol = new LC0268_MissingNumber();

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements (0 to n with one missing):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = sol.missingNumber(nums);

        System.out.println("Missing number is: " + result);
    }
}
