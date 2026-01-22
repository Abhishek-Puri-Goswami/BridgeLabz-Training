import java.util.Scanner;
import java.util.Stack;

public class LC0496_NextGreaterElementI {

    // Finds next greater element for nums1 in nums2
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();

        // Initialize result with -1
        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }

        // Process nums2
        for (int i = 0; i < nums2.length; i++) {
            while (!stack.isEmpty() && nums2[i] > nums2[stack.peek()]) {
                int idx = stack.pop();
                int val = nums2[idx];

                // Update in nums1 if present
                for (int j = 0; j < nums1.length; j++) {
                    if (nums1[j] == val) {
                        result[j] = nums2[i];
                    }
                }
            }
            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0496_NextGreaterElementI sol = new LC0496_NextGreaterElementI();

        System.out.print("Enter size of nums1: ");
        int n1 = input.nextInt();
        int[] nums1 = new int[n1];
        System.out.println("Enter nums1:");
        for (int i = 0; i < n1; i++) {
            nums1[i] = input.nextInt();
        }

        System.out.print("Enter size of nums2: ");
        int n2 = input.nextInt();
        int[] nums2 = new int[n2];
        System.out.println("Enter nums2:");
        for (int i = 0; i < n2; i++) {
            nums2[i] = input.nextInt();
        }

        int[] result = sol.nextGreaterElement(nums1, nums2);

        for (int val : result) {
            System.out.print(val + " ");
        }

        input.close();
    }
}
