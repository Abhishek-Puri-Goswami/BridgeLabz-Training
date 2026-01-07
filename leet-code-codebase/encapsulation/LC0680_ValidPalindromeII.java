import java.util.Scanner;

public class LC0680_ValidPalindromeII {

    // Checks if string can be palindrome after removing one character
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        // Two-pointer check
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right)
                        || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }

        return true;
    }

    // Hides palindrome checking logic
    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0680_ValidPalindromeII sol = new LC0680_ValidPalindromeII();

        System.out.print("Enter string: ");
        String s = input.nextLine();

        System.out.println(sol.validPalindrome(s));

        input.close();
    }
}
