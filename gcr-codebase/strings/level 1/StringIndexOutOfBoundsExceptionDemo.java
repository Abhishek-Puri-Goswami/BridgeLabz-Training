import java.util.Scanner;
public class StringIndexOutOfBoundsExceptionDemo {
    //Method to generate StringIndexOutOfBoundsException without try-catch
    public static void gererateException(String text) {
        int index = -1; // out of bounds
        char character = text.charAt(index); 
    } 
    
    //Method to handle StringIndexOutOfBoundsException with try-catch
    public static void handleException(String text) {
        int index = -1; // out of bounds
	try {
            char character = text.charAt(index);
        } catch(StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught!");
            System.out.println(e.getMessage());
        }
    } 

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.next();
        try {
	    gererateException(text);
        } catch(RuntimeException e) {
            System.out.println("RuntimeException caught!");
            handleException(text);
        }
        System.out.println("Program still running...");
        input.close();
    }
}