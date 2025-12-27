import java.util.Scanner;

public class LC0242_ValidAnagram {

    // Checks whether two strings are anagrams using character frequency counting
    public boolean isAnagram(String s, String t) {

        // If lengths differ, strings cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];

        // Increment frequency for s and decrement for t
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        // If any frequency is non-zero, strings are not anagrams
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = input.nextLine();

        System.out.print("Enter second string: ");
        String t = input.nextLine();

        LC0242_ValidAnagram obj = new LC0242_ValidAnagram();
        boolean result = obj.isAnagram(s, t);

        System.out.println("Are the strings anagrams? " + result);

        input.close();
    }
}