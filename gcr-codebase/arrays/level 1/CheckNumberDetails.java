import java.util.Scanner;
public class CheckNumberDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Declare array to store 5 numbers
        int[] numbers = new int[5];
        // Take input of 5 numbers
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Iterate each number for its details
        for(int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + i + ": "+ numbers[i] + " is: ");
            // Number is positive, negative or zero
            if(numbers[i] <= 0) {
                if(numbers[i] == 0) {
                    System.out.print(" Zero ");
                } else {
                    System.out.print(" Negative ");
                }
            } else {
                System.out.print(" Positive ");
                // Number is even or odd
                if(numbers[i] % 2 == 0) {
                    System.out.print(" Even ");
                } else {
                    System.out.print(" Odd ");
                }
            }
            System.out.println();
        }
        // Compare first and last number
        int first = numbers[0], last = numbers[numbers.length - 1];
        if(first < last) {
            System.out.println("First number " + first + " is less than the Last number " + last);
        } else if(first > last) {
            System.out.println("First number " + first + " is greater than the Last number " + last);
        } else {
            System.out.println("First number " + first + " is equal to the Last number " + last);
        }
	input.close();
    }
}