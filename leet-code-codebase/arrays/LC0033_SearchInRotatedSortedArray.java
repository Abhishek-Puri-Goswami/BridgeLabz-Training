import java.util.Scanner;

public class LC0033_SearchInRotatedSortedArray {

    // Searches target in rotated sorted array
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        // Modified binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Left part is sorted
            if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // Right part is sorted
            else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0033_SearchInRotatedSortedArray sol = new LC0033_SearchInRotatedSortedArray();

        System.out.print("Enter array size: ");
        int n = input.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter rotated sorted array:");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        System.out.print("Enter target: ");
        int target = input.nextInt();

        System.out.println(sol.search(nums, target));

        input.close();
    }
}
