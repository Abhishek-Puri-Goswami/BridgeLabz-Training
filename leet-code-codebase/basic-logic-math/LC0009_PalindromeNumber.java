import java.util.Scanner;

public class LC0009_PalindromeNumber {

    // Checks if the number reads the same backward
    public boolean isPalindrome(int x) {

        // Negative numbers are not palindrome
        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        // Reverse the number
        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0009_PalindromeNumber sol = new LC0009_PalindromeNumber();

        System.out.print("Enter a number: ");
        int x = input.nextInt();

        System.out.println(sol.isPalindrome(x));

        input.close();
    }
}
