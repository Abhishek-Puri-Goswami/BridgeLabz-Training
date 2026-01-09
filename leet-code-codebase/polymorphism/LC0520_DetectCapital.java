import java.util.Scanner;

public class LC0520_DetectCapital {

    // Checks if capital usage in the word is correct
    public boolean detectCapitalUse(String word) {
        int capitals = 0;

        // Count uppercase letters
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                capitals++;
            }
        }

        // All caps OR no caps OR only first letter capital
        return capitals == word.length()
                || capitals == 0
                || (capitals == 1 && Character.isUpperCase(word.charAt(0)));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0520_DetectCapital sol = new LC0520_DetectCapital();

        System.out.print("Enter a word: ");
        String word = input.nextLine();

        System.out.println(sol.detectCapitalUse(word));

        input.close();
    }
}
