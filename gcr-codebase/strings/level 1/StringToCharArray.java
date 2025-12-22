import java.util.Scanner;
public class StringToCharArray {
    //Method to return character array of a string 
    public static char[] stringtoCharArray(String text) {
        char[] charArr = new char[text.length()];
        for(int i = 0; i < text.length(); i++) {
            charArr[i] = text.charAt(i);
        }
        return charArr;
    } 
    
    //Method to comapre two char arrays
    public static boolean compare(char[] charArr1, char[] charArr2) {
        if(charArr1.length != charArr2.length) {
            return false;
        }
        for(int i = 0; i < charArr1.length; i++) {
            if(charArr1[i] != charArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Take a string as input
        String text = input.next();
        
        // Store the results
        char[] charArr1 = stringtoCharArray(text);
        char[] charArr2 = text.toCharArray();
    
        // Display the results
        boolean isSame = compare(charArr1, charArr2);

        if(isSame) {
            System.out.println("Both the results are same.");
        } else {
            System.out.println("Both the results are not same.");
        }
	input.close();
    }
}