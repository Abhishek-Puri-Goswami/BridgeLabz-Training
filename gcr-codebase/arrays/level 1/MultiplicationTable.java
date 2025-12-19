import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Declare table array and input user number 
        int[] table = new int[10];
        int number = input.nextInt();
        
        // Calculate multiplication table of the number
        for(int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Display the multiplication table of the number
        for(int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }
	input.close();
    }
}