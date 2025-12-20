import java.util.Scanner;
public class NumberSign {
    // Create method to return -1 for negative, 0 for zero, and 1 for positive numbers
    public static int checkNumberSign(int number) {
        if(number == 0) {
            return 0;
        } else if(number < 0) {
            return -1;
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Input an integer number
        int number = input.nextInt();
        
        int sign = checkNumberSign(number);
        System.out.println("The method gives " + sign + " for the number " + number);
       	input.close();
    }
}