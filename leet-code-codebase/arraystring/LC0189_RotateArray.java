import java.util.Scanner;

public class LC0189_RotateArray {

    // Rotates the array to the right by k steps
    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        // Reverse full array
        reverse(nums, 0, nums.length - 1);

        // Reverse first k elements
        reverse(nums, 0, k - 1);

        // Reverse remaining elements
        reverse(nums, k, nums.length - 1);
    }

    // Reverses part of the array
    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0189_RotateArray sol = new LC0189_RotateArray();

        System.out.print("Enter array size: ");
        int n = input.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        System.out.print("Enter rotation steps k: ");
        int k = input.nextInt();

        sol.rotate(nums, k);

        for (int num : nums) {
            System.out.print(num + " ");
        }

        input.close();
    }
}
