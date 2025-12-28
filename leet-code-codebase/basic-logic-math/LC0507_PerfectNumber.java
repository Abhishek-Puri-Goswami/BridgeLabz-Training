import java.util.Scanner;

public class LC0507_PerfectNumber {

    // Checks if the number is a perfect number
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }

        int sum = 1;

        // Find divisors and add them
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;

                // Add the paired divisor
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0507_PerfectNumber sol = new LC0507_PerfectNumber();

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println(sol.checkPerfectNumber(num));

        input.close();
    }
}
