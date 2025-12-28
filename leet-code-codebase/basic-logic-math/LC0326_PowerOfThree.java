import java.util.Scanner;

public class LC0326_PowerOfThree {

    // Checks if the number is a power of three
    public boolean isPowerOfThree(int n) {

        // Keep dividing by 3 while possible
        while (n > 1) {
            if (n % 3 != 0) {
                return false;
            }
            n = n / 3;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0326_PowerOfThree sol = new LC0326_PowerOfThree();

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        System.out.println(sol.isPowerOfThree(n));

        input.close();
    }
}
