import java.util.Scanner;
public class DuplicateCharactersRemover {
    // Method to remove duplicate characters from a string
    public static String removeDuplicateChars(String text) {
        String result = "";
        for(int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if(result.indexOf(ch) == -1) {
                result += ch;
            } 
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = input.next();
        
        // Store the string without repeated characters
        String result = removeDuplicateChars(text);

        // Display the result
        System.out.printf("The result for %s is %s%n", text, result);
        input.close();
    }
}