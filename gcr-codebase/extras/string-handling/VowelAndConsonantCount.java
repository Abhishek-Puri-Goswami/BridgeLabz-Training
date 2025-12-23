import java.util.Scanner;
public class VowelAndConsonantCount {
    // Method to count the number of vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String input) {
        String text = input.toLowerCase();
        int countVowel = 0, countConsonants = 0;
        for(int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                countVowel++;
            } else if('a' <= ch && ch <= 'z') {
                countConsonants++;
            }
            //else special character
        }
        return new int[] {countVowel, countConsonants};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = input.next();
        // Array to store counts of vowels and consonants
        int[] results = countVowelsAndConsonants(text);

        // Display the results
        System.out.printf("Count of vowels in %s is %d%n", text, results[0]);
        System.out.printf("Count of Consonants in %s is %d%n", text, results[1]);
        input.close();
    }
}