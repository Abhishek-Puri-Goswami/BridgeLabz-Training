import java.util.Scanner;
public class LC0389_FindTheDifference {
    // Finds the extra character added in string t
    public char findTheDifference(String s, String t) {
        char result = 0;

        // XOR all characters from both strings
        for (int i = 0; i < s.length(); i++) {
            result ^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            result ^= t.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0389_FindTheDifference sol = new LC0389_FindTheDifference();

        System.out.print("Enter string s: ");
        String s = input.nextLine();

        System.out.print("Enter string t: ");
        String t = input.nextLine();

        System.out.println(sol.findTheDifference(s, t));
        input.close();
    }
}
