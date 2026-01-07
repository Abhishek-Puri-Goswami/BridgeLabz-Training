import java.util.Scanner;

public class LC0383_RansomNote {

    // Checks if ransom note can be formed
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];

        fillCount(count, magazine);

        return checkAvailability(count, ransomNote);
    }

    // Hides frequency logic
    private void fillCount(int[] count, String s) {
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
    }

    // Hides validation logic
    private boolean checkAvailability(int[] count, String ransomNote) {
        for (int i = 0; i < ransomNote.length(); i++) {
            if (--count[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0383_RansomNote sol = new LC0383_RansomNote();

        System.out.print("Enter ransom note: ");
        String ransomNote = input.nextLine();

        System.out.print("Enter magazine: ");
        String magazine = input.nextLine();

        System.out.println(sol.canConstruct(ransomNote, magazine));

        input.close();
    }
}
