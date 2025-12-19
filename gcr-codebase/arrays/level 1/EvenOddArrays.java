import java.util.Scanner;
public class EvenOddArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Input an integer number
        int number = input.nextInt();
        if(number <= 0) { // check valid natural number
            System.err.println("Entered number is not a natural number.");
            System.exit(0);
        }

        // Declare even and odd numbers arrays
        int size = number / 2 + 1;
        int[] evens = new int[size];
        int[] odds = new int[size];

        // Store even and odd from 1 to number
        int evenIdx = 0, oddIdx = 0;
        for(int i = 1; i <= number; i++) {
            if(i % 2 == 0) {
                evens[evenIdx++] = i;
            } else {
                odds[oddIdx++] = i;
            }
        }
        
        // Print even numbers array
        System.out.print("Evens: ");
        for(int i = 0; i < evenIdx; i++) {
            System.out.print(evens[i] + " ");
        }

        // Print odd numbers array
        System.out.print("\nOdds: ");
        for(int i = 0; i < oddIdx; i++) {
            System.out.print(odds[i] + " ");
        }
	input.close();
    }
}