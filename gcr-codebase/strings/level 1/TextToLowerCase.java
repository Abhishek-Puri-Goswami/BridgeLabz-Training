import java.util.Scanner;
public class TextToLowerCase {
    // Method to convert upper case string to lower case
    public static String convertToLowerCase(String text) {
        String result = "";
        for(int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if(ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32); 
            } else {
                result += ch;
            }
        }
        return result;
    }

    // Method to compare two strings
    public static boolean compareStrings(String text1, String text2) {
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
        // Input text from user
        String text = input.nextLine();
	
        // Store the results
        String result1 = convertToLowerCase(text);
        String result2 = text.toLowerCase();

        boolean isSame = compareStrings(result1, result2);
        // Display the results
        if(isSame) {
            System.out.println("Both the strings in lowercase are equal.");
        } else {
            System.out.println("Both the strings in lowercase are not equal.");
        }
        input.close();
    }
}