import java.util.Scanner;
import java.util.Arrays;
public class AnagramChecker {
    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Check if lengths are equal
        if (text1.length() != text2.length()) {
            return false;
        }
        // Arrays to store character frequencies
        int[] frequency1 = new int[256];
        int[] frequency2 = new int[256];

        // Calculate frequency of characters in text1
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
        }

        // Calculate frequency of characters in text2
        for (int i = 0; i < text2.length(); i++) {
            frequency2[text2.charAt(i)]++;
        }

        // Compare frequencies
        return Arrays.equals(frequency1, frequency2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first text: ");
        String text1 = input.nextLine();
        System.out.print("Enter the second text: ");
        String text2 = input.nextLine();

        // Check if the texts are anagrams
        boolean result = areAnagrams(text1, text2);

        // Display the result
        System.out.println("\nAre the texts anagrams? " + result);
        input.close();
    }
}
