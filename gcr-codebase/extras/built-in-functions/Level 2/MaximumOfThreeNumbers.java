import java.util.Scanner;
public class MaximumOfThreeNumbers {
    // method to take input
    private static int[] getInput() {
        Scanner input = new Scanner(System.in);
        int[] number = new int[3];
        System.out.print("Enter the first number: ");
        number[0] = input.nextInt();
        System.out.print("Enter the second number: ");
        number[1] = input.nextInt();
        System.out.print("Enter the third number: ");
        number[2] = input.nextInt();
        input.close();
        return number;
    }

    // Method to find the maximum of three
    private static int findMaximum(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        int[] number = getInput();
        int max = findMaximum(number[0], number[1], number[2]);
        System.out.println("The maximum of the three numbers is: " + max);
    }
}
