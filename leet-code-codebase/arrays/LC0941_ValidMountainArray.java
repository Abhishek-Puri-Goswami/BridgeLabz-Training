import java.util.Scanner;

public class LC0941_ValidMountainArray {

    // Checks if the array forms a valid mountain
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if (n < 3)
            return false;

        int i = 0;

        // Walk up
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        // Peak cannot be first or last
        if (i == 0 || i == n - 1) {
            return false;
        }

        // Walk down
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == n - 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0941_ValidMountainArray sol = new LC0941_ValidMountainArray();

        System.out.print("Enter array size: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println(sol.validMountainArray(arr));
        input.close();
    }
}
