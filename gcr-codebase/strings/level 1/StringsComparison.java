import java.util.Scanner;
public class StringsComparison {
    
    //Method to check if two strings are equal
    public static boolean compare(String text1, String text2) {
        if(text1.length() != text2.length()) {
            return false;
        }
        for(int i = 0; i < text1.length(); i++) {
            if(text1.charAt(i) != text2.charAt(i)) {
                return false;
            }
        }
        return true;
    } 
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Take two strings as input
        String text1 = input.next();
        String text2 = input.next();

        // Store the results
        boolean isEqualUsingCharAt = compare(text1, text2);
        boolean isEqualUsingEquals = text1.equals(text2);
    
        // Display the results
        if(isEqualUsingCharAt && isEqualUsingEquals) {
            System.out.println("Both the results are same.");
        } else {
            System.out.println("Both the results are not same.");
        }
	input.close();
    }
}