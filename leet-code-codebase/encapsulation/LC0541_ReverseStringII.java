import java.util.Scanner;

public class LC0541_ReverseStringII {

    // Reverses first k characters for every 2k block
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();

        // Process string in blocks
        for (int i = 0; i < arr.length; i += 2 * k) {
            int left = i;
            int right = Math.min(i + k - 1, arr.length - 1);

            reverse(arr, left, right);
        }

        return new String(arr);
    }

    // Hides reverse logic
    private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0541_ReverseStringII sol = new LC0541_ReverseStringII();

        System.out.print("Enter string: ");
        String s = input.nextLine();

        System.out.print("Enter k value: ");
        int k = input.nextInt();

        System.out.println(sol.reverseStr(s, k));

        input.close();
    }
}
