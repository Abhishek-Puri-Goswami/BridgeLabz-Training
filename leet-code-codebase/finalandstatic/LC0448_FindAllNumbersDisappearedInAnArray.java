import java.util.Scanner;

public class LC0448_FindAllNumbersDisappearedInAnArray {

    // Marks visited numbers and prints missing ones
    public void findDisappearedNumbers(int[] nums) {

        // Mark visited indices
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        // Print missing numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                System.out.print((i + 1) + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0448_FindAllNumbersDisappearedInAnArray sol = new LC0448_FindAllNumbersDisappearedInAnArray();

        System.out.print("Enter array size: ");
        int n = input.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        sol.findDisappearedNumbers(nums);

        input.close();
    }
}
