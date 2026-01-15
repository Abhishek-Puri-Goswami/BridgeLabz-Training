import java.util.Scanner;

public class LC0459_RepeatedSubstringPattern {

    // Checks if the string can be formed by repeating a substring
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        // Try all possible substring lengths
        for (int len = 1; len <= n / 2; len++) {
            if (n % len == 0) {
                String part = s.substring(0, len);
                String built = "";

                // Build string using the substring
                for (int i = 0; i < n / len; i++) {
                    built += part;
                }

                if (built.equals(s)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0459_RepeatedSubstringPattern sol = new LC0459_RepeatedSubstringPattern();

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.println(sol.repeatedSubstringPattern(s));

        input.close();
    }
}
