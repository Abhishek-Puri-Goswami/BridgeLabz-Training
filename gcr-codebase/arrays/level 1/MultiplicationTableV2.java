import java.util.Scanner;
public class MultiplicationTableV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Declare table array and input user number 
        int[] table = new int[4];
        int number = input.nextInt();
        
        // Calculate multiplication table of the number
        for(int i = 6; i <= 9; i++) {
            table[i - 6] = number * i;
        }

        // Display the multiplication table of the number
        for(int i = 0; i < 4; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + table[i]);
        }
	input.close();
    }
}