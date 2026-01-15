import java.util.Scanner;

public class LC0387_FirstUniqueCharacterInAString {

    // Finds index of first non-repeating character
    public int firstUniqChar(String s) {
        int[] count = new int[26];

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        // Find first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0387_FirstUniqueCharacterInAString sol = new LC0387_FirstUniqueCharacterInAString();

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.println(sol.firstUniqChar(s));

        input.close();
    }
}
