import java.util.Scanner;

public class LC0415_AddStrings {

    // Adds two numbers represented as strings
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        String result = "";

        // Add digits from right to left
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;

            if (i >= 0)
                sum += num1.charAt(i--) - '0';
            if (j >= 0)
                sum += num2.charAt(j--) - '0';

            result = (sum % 10) + result;
            carry = sum / 10;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0415_AddStrings sol = new LC0415_AddStrings();

        System.out.print("Enter first number string: ");
        String num1 = input.nextLine();

        System.out.print("Enter second number string: ");
        String num2 = input.nextLine();

        System.out.println(sol.addStrings(num1, num2));

        input.close();
    }
}
