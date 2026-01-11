import java.util.Scanner;

public class LC1089_DuplicateZeros {

    // Duplicates each zero and shifts remaining elements
    public void duplicateZeros(int[] arr) {
        int possibleDups = 0;
        int length = arr.length - 1;

        // Count zeros that can be duplicated
        for (int i = 0; i <= length - possibleDups; i++) {
            if (arr[i] == 0) {
                if (i == length - possibleDups) {
                    arr[length] = 0;
                    length--;
                    break;
                }
                possibleDups++;
            }
        }

        int last = length - possibleDups;

        // Copy elements backwards and duplicate zeros
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC1089_DuplicateZeros sol = new LC1089_DuplicateZeros();

        System.out.print("Enter array size: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        sol.duplicateZeros(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }

        input.close();
    }
}
