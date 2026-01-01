import java.util.Scanner;
public class LC0258_AddDigits {
    // Repeatedly adds digits until a single digit remains
    public int addDigits(int num) {
        // Repeat until number becomes single digit
        while (num >= 10) {
            int sum = 0;
            // Add all digits of the number
            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }
            num = sum;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0258_AddDigits sol = new LC0258_AddDigits();

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println(sol.addDigits(num));
        input.close();
    }
}
