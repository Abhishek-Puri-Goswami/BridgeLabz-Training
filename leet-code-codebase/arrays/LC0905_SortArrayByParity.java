import java.util.Scanner;

public class LC0905_SortArrayByParity {

    // Moves all even numbers first followed by odd numbers
    public void sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        // Two pointer approach
        while (left < right) {
            if (nums[left] % 2 > nums[right] % 2) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }

            if (nums[left] % 2 == 0)
                left++;
            if (nums[right] % 2 == 1)
                right--;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0905_SortArrayByParity sol = new LC0905_SortArrayByParity();

        System.out.print("Enter array size: ");
        int n = input.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        sol.sortArrayByParity(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }

        input.close();
    }
}
