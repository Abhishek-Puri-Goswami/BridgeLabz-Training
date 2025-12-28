import java.util.Scanner;

public class LC1281_SubtractProductAndSum {

    // Computes product of digits minus sum of digits of a number
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        // Process each digit of the number
        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n /= 10;
        }

        return product - sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC1281_SubtractProductAndSum sol = new LC1281_SubtractProductAndSum();

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        System.out.println(sol.subtractProductAndSum(n));

        input.close();
    }
}
