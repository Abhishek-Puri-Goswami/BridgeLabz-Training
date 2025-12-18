// Create LargestOfThreeNumbers class to check if first, second or third  number is the largest of the three
import java.util.Scanner;
public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        // Create Scanner object to take inputs from user
        Scanner input = new Scanner(System.in);
        
        // Input three integer numbers
        System.out.print("Enter first integer : ");
        int number1 = input.nextInt();
        System.out.print("Enter second integer : ");
        int number2 = input.nextInt();
        System.out.print("Enter third integer : ");
        int number3 = input.nextInt();
	
	Boolean isFirstLargest = false, 
                isSecondLargest = false, 
                isThirdLargest = false;
        if(number1 > number2 && number1 > number3) {
	    isFirstLargest = true;
        } else if(number2 > number3) {
            isSecondLargest = true;
        } else {
            isThirdLargest = true;
        }

        // Display whether first number is the largest
        System.out.println("Is the first number the largest? " + (isFirstLargest? "Yes" : "No"));
        System.out.println("Is the second number the largest? " + (isSecondLargest? "Yes" : "No"));
        System.out.println("Is the third number the largest? " + (isThirdLargest? "Yes" : "No"));        
	input.close(); // Close Scanner object
    }
}