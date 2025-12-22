import java.util.Scanner;
public class PalindromeChecker {
    // Check palindrome using two pointers
    public static boolean isPalindromeUsingIndices(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Check palindrome using recursion
    public static boolean isPalindromeUsingRecursion(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeUsingRecursion(text, start + 1, end - 1);
    }

    // Check palindrome using character arrays
    public static boolean isPalindromeUsingCharArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            reversed[i] = text.charAt(text.length() - 1 - i);
        }

        for (int i = 0; i < text.length(); i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Checking for palindrome using different logics
        boolean resultIndices = isPalindromeUsingIndices(text);
        boolean resultRecursion = isPalindromeUsingRecursion(text, 0, text.length() - 1);
        boolean resultCharArray = isPalindromeUsingCharArray(text);

        // Displaying results
        System.out.println("\nPalindrome check results:");
        System.out.println("Using indices: " + resultIndices);
        System.out.println("Using recursion: " + resultRecursion);
        System.out.println("Using character arrays: " + resultCharArray);
        input.close();
    }
}
