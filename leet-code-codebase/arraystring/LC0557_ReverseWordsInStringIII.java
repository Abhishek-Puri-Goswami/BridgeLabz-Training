import java.util.Scanner;

public class LC0557_ReverseWordsInStringIII {

    // Reverses each word in the sentence
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int start = 0;

        // Reverse each word separately
        for (int i = 0; i <= arr.length; i++) {
            if (i == arr.length || arr[i] == ' ') {
                reverse(arr, start, i - 1);
                start = i + 1;
            }
        }

        return new String(arr);
    }

    // Reverses characters between two indexes
    private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0557_ReverseWordsInStringIII sol = new LC0557_ReverseWordsInStringIII();

        System.out.print("Enter a sentence: ");
        String s = input.nextLine();

        System.out.println(sol.reverseWords(s));

        input.close();
    }
}
