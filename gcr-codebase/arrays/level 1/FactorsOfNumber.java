import java.util.Scanner;
public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Input the number
        int number = input.nextInt();
   
        // Initial array size for factors array
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Iterate from 1 to number to store factors
        for(int i = 1; i < number; i++) {
            if(number % i != 0) {
                continue; // Not a factor, move to next number
            } else {
                factors[index] = i; // Store factor in array
                index++;
            }
            // Factors array full, create new double size array
            if(index == maxFactor) {
                maxFactor *= 2;
                int[] temp = new int[maxFactor];
                
                // Copy factors array into temp array
                System.arraycopy(factors, 0, temp, 0, factors.length);

                // Assign temp array to factors array
                factors = temp;
            }
        }

        // Display the factors of number
        for(int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
       	input.close();
    }
}