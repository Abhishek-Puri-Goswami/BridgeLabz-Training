import java.util.Scanner;
import java.util.Stack;

public class LC0020_ValidParentheses {

    // Checks if brackets are valid
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        // Process each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Match closing brackets
            else {
                if (stack.isEmpty())
                    return false;

                char top = stack.pop();

                if (ch == ')' && top != '(')
                    return false;
                if (ch == '}' && top != '{')
                    return false;
                if (ch == ']' && top != '[')
                    return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0020_ValidParentheses sol = new LC0020_ValidParentheses();

        System.out.print("Enter bracket string: ");
        String s = input.nextLine();

        System.out.println(sol.isValid(s));

        input.close();
    }
}
