import java.util.Scanner;
public class StringPalindromeChecker {
    // Method to check if a string is palindrome
    public static boolean isPalindrome(String text) {
        int start = 0;
        int end = text.length() - 1;
        while(start < end) {
            if(text.charAt(start++) != text.charAt(end--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = input.next();
        
        // Check if the string is palindrome or not
        boolean isPalindrome = isPalindrome(text);

        // Display the result
        System.out.printf("%s is palindromic string? %b%n", text, isPalindrome);
        input.close();
    }
}