import java.util.*;

class LC0026_RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i - 1]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LC0026_RemoveDuplicates sol = new LC0026_RemoveDuplicates();

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sol.removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);
        System.out.println("Array after removing duplicates: " +
                Arrays.toString(Arrays.copyOf(nums, k)));
    }
}
