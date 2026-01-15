import java.util.Scanner;

public class LC0647_PalindromicSubstrings {

    // Counts all palindromic substrings
    public int countSubstrings(String s) {
        int count = 0;

        // Try each index as center
        for (int i = 0; i < s.length(); i++) {
            count += expand(s, i, i);
            count += expand(s, i, i + 1);
        }

        return count;
    }

    // Expands around center and counts palindromes
    private int expand(String s, int left, int right) {
        int cnt = 0;

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            cnt++;
            left--;
            right++;
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0647_PalindromicSubstrings sol = new LC0647_PalindromicSubstrings();

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.println(sol.countSubstrings(s));

        input.close();
    }
}
