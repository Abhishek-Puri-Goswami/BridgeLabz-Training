import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Declare double array for 10 elements
        double[] numbers = new double[10];
        
        // Input positive non-zero elements only 
        int index = 0;
        while(true) {
            double num = input.nextDouble();
            if(num > 0) {
               numbers[index++] = num;
            }
            // Exit loop array full
            if(index == 10) {
                break;
            }
        }

        // Display elements and their sum
        double sum = 0.0;
        System.out.print("Elements are ");
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];  // Sum elements
            System.out.print(numbers[i] + " "); // print elements
        }
        System.out.println("\nSum is " + sum);
	input.close();
    }
}