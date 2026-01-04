import java.util.Scanner;

public class LC0434_NumberOfSegmentsInAString {

    // Counts number of words in a string
    public int countSegments(String s) {
        int count = 0;
        boolean inWord = false;

        // Traverse characters to find word boundaries
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && !inWord) {
                count++;
                inWord = true;
            } else if (s.charAt(i) == ' ') {
                inWord = false;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0434_NumberOfSegmentsInAString sol = new LC0434_NumberOfSegmentsInAString();

        System.out.print("Enter a sentence: ");
        String s = input.nextLine();

        System.out.println(sol.countSegments(s));

        input.close();
    }
}
