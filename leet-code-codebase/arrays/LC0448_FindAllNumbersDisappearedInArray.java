import java.util.Scanner;

public class LC0448_FindAllNumbersDisappearedInArray {

    // Prints numbers that are missing from 1 to n
    public void findDisappearedNumbers(int[] nums) {

        // Mark visited numbers using index
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        // Print numbers which are still positive
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                System.out.print((i + 1) + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0448_FindAllNumbersDisappearedInArray sol = new LC0448_FindAllNumbersDisappearedInArray();

        System.out.print("Enter array size: ");
        int n = input.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements (1 to n range):");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        sol.findDisappearedNumbers(nums);

        input.close();
    }
}
