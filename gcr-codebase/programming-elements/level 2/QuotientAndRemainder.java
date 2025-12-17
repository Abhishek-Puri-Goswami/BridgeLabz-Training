import java.util.Scanner;
public class QuotientAndRemainder {
    public static void main(String[] args) {
        //Creating Scanner object to take user input
        Scanner input = new Scanner(System.in);
        double number1, number2;
        double quotient, remainder;

        //Input and calculations
        number1 = input.nextDouble();
        number2 = input.nextDouble();
        quotient = number1 / number2;
        remainder = number1 % number2;

        //Displaying the results
        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two numbers " + number1 + " and " + number2);
        input.close(); //Closing Scanner object
    }
}