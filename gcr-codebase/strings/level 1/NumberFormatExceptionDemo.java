import java.util.Scanner;
public class NumberFormatExceptionDemo {
    //Method to generate NumberFormatException without try-catch
    public static void gererateException(String text) {
        int number = Integer.parseInt(text);
    } 
    
    //Method to handle NumberFormatException with try-catch
    public static void handleException(String text) {
      	try {
            int number = Integer.parseInt(text);
        } catch(NumberFormatException e) {
            System.out.println("NumberFormatException caught!");
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