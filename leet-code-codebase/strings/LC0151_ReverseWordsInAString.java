import java.util.Scanner;

public class LC0151_ReverseWordsInAString {

    // Reverses the order of words in a string
    public String reverseWords(String s) {
        s = s.trim();
        String result = "";
        int i = s.length() - 1;

        // Read words from end
        while (i >= 0) {
            int end = i;

            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            result += s.substring(i + 1, end + 1) + " ";

            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
        }

        return result.trim();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0151_ReverseWordsInAString sol = new LC0151_ReverseWordsInAString();

        System.out.print("Enter a sentence: ");
        String s = input.nextLine();

        System.out.println(sol.reverseWords(s));

        input.close();
    }
}
