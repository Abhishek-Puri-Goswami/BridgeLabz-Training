import java.util.Scanner;

public class LC2235_AddTwoIntegers {

    // Returns the sum of two integers
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC2235_AddTwoIntegers sol = new LC2235_AddTwoIntegers();

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.println("Sum: " + sol.sum(num1, num2));

        input.close();
    }
}
