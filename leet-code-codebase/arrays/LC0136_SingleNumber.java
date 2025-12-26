import java.util.*;

public class LC0136_SingleNumber {

    public int singleNumber(int[] nums) {
        int res = 0;
        for (int n : nums) {
            res ^= n;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LC0136_SingleNumber sol = new LC0136_SingleNumber();

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements (pairs + one unique):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = sol.singleNumber(nums);

        System.out.println("Single number is: " + result);
    }
}
