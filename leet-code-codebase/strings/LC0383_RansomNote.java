import java.util.Scanner;

public class LC0383_RansomNote {

    // Checks if ransom note can be constructed from magazine characters
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] freq = new int[26];

        // Count characters in magazine
        for (char c : magazine.toCharArray()) {
            freq[c - 'a']++;
        }

        // Use characters for ransom note
        for (char c : ransomNote.toCharArray()) {
            if (freq[c - 'a'] == 0) {
                return false;
            }
            freq[c - 'a']--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ransom note string: ");
        String ransomNote = input.nextLine();

        System.out.print("Enter magazine string: ");
        String magazine = input.nextLine();

        LC0383_RansomNote obj = new LC0383_RansomNote();
        System.out.println(obj.canConstruct(ransomNote, magazine));

        input.close();
    }
}