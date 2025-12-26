import java.util.*;
public class LC0027_RemoveElement {

    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LC0027_RemoveElement sol = new LC0027_RemoveElement();

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter element to remove: ");
        int val = sc.nextInt();

        int k = sol.removeElement(nums, val);

        System.out.println("Number of elements after removal: " + k);
        System.out.println("Array after removing element: " +
                Arrays.toString(Arrays.copyOf(nums, k)));
    }
}
