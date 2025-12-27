import java.util.Scanner;

public class LC0387_FirstUniqueCharacter {

    // Returns index of the first non-repeating character
    public int firstUniqChar(String s) {

        // Frequency array for lowercase letters
        int[] freq = new int[26];

        // Count occurrences of each character
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Find first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        // No unique character found
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        LC0387_FirstUniqueCharacter obj = new LC0387_FirstUniqueCharacter();
        System.out.println(obj.firstUniqChar(s));

        input.close();
    }
}