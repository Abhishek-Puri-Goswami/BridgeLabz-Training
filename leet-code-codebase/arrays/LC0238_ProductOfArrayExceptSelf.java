import java.util.Scanner;

public class LC0238_ProductOfArrayExceptSelf {

    // Returns array where each element is product of all except itself
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Build prefix products
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Multiply with suffix products
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * suffix;
            suffix *= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0238_ProductOfArrayExceptSelf sol = new LC0238_ProductOfArrayExceptSelf();

        System.out.print("Enter array size: ");
        int n = input.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        int[] result = sol.productExceptSelf(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }

        input.close();
    }
}
