import java.util.Scanner;

public class LC0459_RepeatedSubstringPattern {

    // Checks if the string can be formed by repeating a substring
    public boolean repeatedSubstringPattern(String s) {

        // Concatenate string with itself and remove first & last character
        String doubled = (s + s).substring(1, 2 * s.length() - 1);

        // If original string exists inside, it has a repeating pattern
        return doubled.contains(s);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        LC0459_RepeatedSubstringPattern obj = new LC0459_RepeatedSubstringPattern();
        System.out.println(obj.repeatedSubstringPattern(s));

        input.close();
    }
}