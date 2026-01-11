import java.util.Scanner;

public class LC0349_IntersectionOfTwoArrays {

    // Finds intersection of two arrays
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;

        // Compare each element from nums1 with nums2
        for (int i = 0; i < nums1.length; i++) {
            boolean alreadyAdded = false;

            // Check if already present in result
            for (int k = 0; k < index; k++) {
                if (temp[k] == nums1[i]) {
                    alreadyAdded = true;
                    break;
                }
            }

            if (!alreadyAdded) {
                for (int j = 0; j < nums2.length; j++) {
                    if (nums1[i] == nums2[j]) {
                        temp[index++] = nums1[i];
                        break;
                    }
                }
            }
        }

        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
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

        for (int num : result) {
            System.out.print(num + " ");
        }

        input.close();
    }
}
