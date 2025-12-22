import java.util.Scanner;
public class ArrayIndexOutOfBoundsExceptionDemo {
    //Method to generate ArrayIndexOutOfBoundsException without try-catch
    public static void gererateException(String[] names) {
        String name = names[names.length]; // index out of length
    } 
    
    //Method to handle ArrayIndexOutOfBoundsException with try-catch
    public static void handleException(String[] names) {
      	try {
            String name = names[names.length]; // index out of length
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
            System.out.println(e.getMessage());
        } catch(RuntimeException e) {
            System.out.println("RuntimeException caught!");
            System.out.println(e.getMessage());
        }  
    } 

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = new String[5];
        
        // Input 5 names from user
        for(int i = 0; i < names.length; i++) {
            names[i] = input.next();
        }

        try {
	    gererateException(names); // throws exception
        } catch(RuntimeException e) {
            System.out.println("RuntimeException caught!");
            handleException(names);
        } 
        System.out.println("Program still running...");
        input.close();
    }
}