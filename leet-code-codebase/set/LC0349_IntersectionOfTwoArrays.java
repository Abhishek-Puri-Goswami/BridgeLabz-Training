import java.util.Scanner;
import java.util.HashSet;

public class LC0349_IntersectionOfTwoArrays {

    // Returns unique common elements from both arrays
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();

        // Store elements of first array
        for (int num : nums1) {
            set1.add(num);
        }

        // Check second array against set1
        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }

        // Convert set to array
        int[] result = new int[resultSet.size()];
        int index = 0;

        for (int val : resultSet) {
            result[index++] = val;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0349_IntersectionOfTwoArrays sol = new LC0349_IntersectionOfTwoArrays();

        System.out.print("Enter size of first array: ");
        int n1 = input.nextInt();

        int[] nums1 = new int[n1];
        System.out.println("Enter first array elements:");
        for (int i = 0; i < n1; i++) {
            nums1[i] = input.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = input.nextInt();

        int[] nums2 = new int[n2];
        System.out.println("Enter second array elements:");
        for (int i = 0; i < n2; i++) {
            nums2[i] = input.nextInt();
        }

        int[] result = sol.intersection(nums1, nums2);

        for (int val : result) {
            System.out.print(val + " ");
        }

        input.close();
    }
}
