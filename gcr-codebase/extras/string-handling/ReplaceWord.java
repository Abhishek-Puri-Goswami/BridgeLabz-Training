import java.util.Scanner;
public class ReplaceWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt to get input from the user
        System.out.println("Enter a sentence: ");
        String str = input.nextLine();
        System.out.println("Enter a word which you want to replace");
        String wordReplace = input.next();
        System.out.println("Enter a word which you want to put in a word");
        String wordPut = input.next();

        // Call the built-in method to replace the word
        String result = str.replace(wordReplace, wordPut);

        // Display the result
        System.out.println("The result after replacing a word in a sentence is: " + result);
        input.close();
    }
}
