import java.util.Scanner;
public class RemainderAndQuotient {
    // Method to find the quotient and remainder two numbers
    public static int[] findRemainderAndQuotient(int number1, int number2) {
        int remainder = number1 % number2;
        int quotient = number1 / number2;
        return new int[]{remainder, quotient};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Input two integer numbers
        int number1  = input.nextInt();
        int number2  = input.nextInt();
        
        int[] results = findRemainderAndQuotient(number1, number2);
        System.out.println("The remainder of " + number1 + " / " + number2 + " is " + results[0]);
        System.out.println("The quotient of " + number1 + " / " + number2 + " is " + results[1]);
       	input.close();
    }
}