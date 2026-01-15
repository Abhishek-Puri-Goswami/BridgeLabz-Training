import java.util.*;

public class LC0438_FindAllAnagramsInAString {

    // Finds starting indices of anagrams of p in s
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length())
            return result;

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        // Count characters in p
        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
        }

        int window = p.length();

        // Sliding window
        for (int i = 0; i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;

            if (i >= window) {
                sCount[s.charAt(i - window) - 'a']--;
            }

            if (isEqual(pCount, sCount)) {
                result.add(i - window + 1);
            }
        }

        return result;
    }

    // Compares two frequency arrays
    private boolean isEqual(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0438_FindAllAnagramsInAString sol = new LC0438_FindAllAnagramsInAString();

        System.out.print("Enter string s: ");
        String s = input.nextLine();

        System.out.print("Enter pattern p: ");
        String p = input.nextLine();

        List<Integer> result = sol.findAnagrams(s, p);

        for (int idx : result) {
            System.out.print(idx + " ");
        }

        input.close();
    }
}
