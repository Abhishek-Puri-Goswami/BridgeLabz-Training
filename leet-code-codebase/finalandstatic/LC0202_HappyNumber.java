import java.util.Scanner;

public class LC0202_HappyNumber {

    // Checks if a number is a happy number
    public boolean isHappy(int n) {

        // Repeat until number becomes 1 or loops
        while (n != 1 && n != 4) {
            int sum = 0;

            // Replace number by sum of squares of digits
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            n = sum;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0202_HappyNumber sol = new LC0202_HappyNumber();

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        System.out.println(sol.isHappy(n));

        input.close();
    }
}
