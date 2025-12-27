import java.util.Scanner;

public class LC0058_LengthOfLastWord {

    // Returns the length of the last word in the given string
    public int lengthOfLastWord(String s) {
        int end = s.length() - 1;

        // Skip trailing spaces
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }

        int start = end;

        // Move backward until space or start of string is found
        while (start >= 0 && s.charAt(start) != ' ') {
            start--;
        }

        return end - start;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String s = input.nextLine();

        LC0058_LengthOfLastWord obj = new LC0058_LengthOfLastWord();
        int result = obj.lengthOfLastWord(s);

        System.out.println("Length of last word: " + result);

        input.close();
    }
}