import java.util.Scanner;

public class LC0557_ReverseWordsInStringIII {

    // Reverses each word in the string while keeping word order
    public String reverseWords(String s) {

        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        // Reverse characters of each word
        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            result.append(sb.reverse()).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String s = input.nextLine();

        LC0557_ReverseWordsInStringIII obj = new LC0557_ReverseWordsInStringIII();
        System.out.println(obj.reverseWords(s));

        input.close();
    }
}