import java.util.Scanner;
public class StringLongestWord {
    // Method to check if a string is palindrome
    public static String findLongestWord(String text) {
        String[] words = text.split("\\s+");
        String longestWord = "";
        int longestLength = 0;
        for(int i = 0; i < words.length; i++) {
            int length = words[i].length();
            if(length > longestLength) {
                longestWord = words[i];
                longestLength = length;
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = input.nextLine();
        
        // find the longest word is a string sentence
        String longest = findLongestWord(text);

        // Display the result
        System.out.println("The longest word is " + longest);
        input.close();
    }
}