import java.util.*;

public class LC0014_LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String pref = strs[0];
        int prefLen = pref.length();

        for (int i = 1; i < strs.length; i++) {
            String s = strs[i];
            while (prefLen > s.length() || !pref.equals(s.substring(0, prefLen))) {
                prefLen--;
                if (prefLen == 0) {
                    return "";
                }
                pref = pref.substring(0, prefLen);
            }
        }

        return pref;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0014_LongestCommonPrefix sol = new LC0014_LongestCommonPrefix();

        System.out.print("Enter number of strings: ");
        int n = input.nextInt();
        input.nextLine();

        String[] strs = new String[n];
        System.out.println("Enter strings:");
        for (int i = 0; i < n; i++) {
            strs[i] = input.nextLine();
        }

        System.out.println("Longest Common Prefix: " + sol.longestCommonPrefix(strs));
        input.close();
    }
}
