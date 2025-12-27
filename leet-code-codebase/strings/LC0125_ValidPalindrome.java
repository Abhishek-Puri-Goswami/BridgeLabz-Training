import java.util.Scanner;

public class LC0125_ValidPalindrome {

    // Checks whether the given string is a valid palindrome
    public boolean isPalindrome(String s) {

        // Normalize string: lowercase and remove non-alphanumeric characters
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0;
        int right = s.length() - 1;

        // Compare characters from both ends
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        // All characters matched
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        LC0125_ValidPalindrome obj = new LC0125_ValidPalindrome();
        System.out.println(obj.isPalindrome(s));

        input.close();
    }
}
