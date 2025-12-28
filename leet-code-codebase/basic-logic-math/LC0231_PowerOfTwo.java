import java.util.Scanner;

public class LC0231_PowerOfTwo {

    // Checks whether the number is a power of two
    public boolean isPowerOfTwo(int n) {

        // Power of two numbers are positive and have only one set bit
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0231_PowerOfTwo sol = new LC0231_PowerOfTwo();

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        System.out.println(sol.isPowerOfTwo(n));

        input.close();
    }
}
