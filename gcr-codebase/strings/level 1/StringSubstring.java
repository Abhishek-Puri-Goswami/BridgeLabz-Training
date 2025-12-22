import java.util.Scanner;
public class StringSubstring {
    
    //Method to return the substring of a string
    public static String createSubstring(String text, int startIdx, int endIdx) {
        String subStr = "";
        if(text.length() == 0 || startIdx >= endIdx) {
            return "";
        }
        
        for(int i = startIdx; i < endIdx; i++) {
            subStr += text.charAt(i);
        }
        return subStr;
    } 
    
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
        // Take a string and substring starting and ending indices as input
        String text = input.next();
        int startIdx = input.nextInt();
        int endIdx = input.nextInt();

        // Find the substrings
        String subStr1 = createSubstring(text, startIdx, endIdx);
	String subStr2 = text.substring(startIdx, endIdx);

        // Compare & Dispaly the results
        boolean isSame = compare(subStr1, subStr2);
        if(isSame) {
            System.out.println("Both the substrings are equal.");
        } else {
            System.out.println("Both the substrings are not equal.");
        }
	input.close();
    }
}