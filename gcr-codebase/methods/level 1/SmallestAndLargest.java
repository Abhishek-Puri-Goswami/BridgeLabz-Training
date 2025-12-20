import java.util.Scanner;
public class SmallestAndLargest {
    // Method to find the smallest and largest of three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        if(number1 > number2 && number1 > number3) {
            largest = number1;
        } else if(number2 > number3) {
            largest = number2;
        } else {
            largest = number3;
        }

        if(number1 < number2 && number1 < number3) {
            smallest = number1;
        } else if(number2 < number3) {
            smallest = number2;
        } else {
            smallest = number3;
        }  

        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Input three integer numbers
        int number1  = input.nextInt();
        int number2  = input.nextInt();
        int number3  = input.nextInt();

        int[] results = findSmallestAndLargest(number1, number2, number3);
        System.out.println("The smallest of the three numbers is " + results[0]);
        System.out.println("The largest of the three numbers is " + results[1]);
       	input.close();
    }
}