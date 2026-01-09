import java.util.Scanner;

public class LC0013_RomanToInteger {

    // Converts Roman numeral to integer
    public int romanToInt(String s) {
        int total = 0;

        // Traverse characters and apply rules
        for (int i = 0; i < s.length(); i++) {
            int current = getValue(s.charAt(i));

            // Check next character for subtraction case
            if (i + 1 < s.length() && current < getValue(s.charAt(i + 1))) {
                total -= current;
            } else {
                total += current;
            }
        }

        return total;
    }

    // Returns value of a Roman character
    private int getValue(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0013_RomanToInteger sol = new LC0013_RomanToInteger();

        System.out.print("Enter Roman numeral: ");
        String s = input.nextLine();

        System.out.println(sol.romanToInt(s));

        input.close();
    }
}
