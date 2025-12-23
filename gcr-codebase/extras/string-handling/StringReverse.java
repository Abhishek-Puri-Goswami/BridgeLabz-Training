import java.util.Scanner;
public class StringReverse {
    // Method to reverse a string
    public static String reverse(String text) {
        StringBuffer reverse = new StringBuffer("");
        // Loop to traverse string from end to start
        for(int i = text.length() - 1; i >= 0; i--) {
            char ch = text.charAt(i);
            reverse.append(ch);
        }
        return reverse.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = input.next();
        
        // find reverse of string
        String reverse = reverse(text);

        // Display the reversed string
        System.out.printf("%s is the reversed string for %s%n", reverse, text);
        input.close();
    }
}