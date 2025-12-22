import java.util.Scanner;
public class IllegalArgumentExceptionDemo {
    //Method to generate IllegalArgumentException without try-catch
    public static void gererateException(String text) {
        int startIdx = text.length() - 1; 
        int endIdx = 0;
        String subStr = text.substring(startIdx, endIdx); //startIdx > endIdx \
    } 
    
    //Method to handle IllegalArgumentException with try-catch
    public static void handleException(String text) {
        int startIdx = text.length() - 1; 
        int endIdx = 0;
	try {
            String subStr = text.substring(startIdx, endIdx);
        } catch(IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught!");
            System.out.println(e.getMessage());
        } catch(RuntimeException e) {
            System.out.println("RuntimeException caught!");
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