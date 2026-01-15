import java.util.Scanner;

public class LC0003_LongestSubstringWithoutRepeatingCharacters {

    // Finds length of longest substring without repeating characters
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[256];
        int left = 0;
        int maxLen = 0;

        // Sliding window
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            freq[ch]++;

            // Move left pointer to remove duplicates
            while (freq[ch] > 1) {
                freq[s.charAt(left)]--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0003_LongestSubstringWithoutRepeatingCharacters sol = new LC0003_LongestSubstringWithoutRepeatingCharacters();

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.println(sol.lengthOfLongestSubstring(s));

        input.close();
    }
}
