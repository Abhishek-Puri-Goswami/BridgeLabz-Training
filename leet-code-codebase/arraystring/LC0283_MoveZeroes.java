import java.util.Scanner;

public class LC0283_MoveZeroes {

    // Moves all zeroes to the end while keeping order of non-zero elements
    public void moveZeroes(int[] nums) {
        int index = 0;

        // Place all non-zero values first
        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }

        // Fill remaining positions with zero
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0283_MoveZeroes sol = new LC0283_MoveZeroes();

        System.out.print("Enter array size: ");
        int n = input.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        sol.moveZeroes(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }

        input.close();
    }
}
