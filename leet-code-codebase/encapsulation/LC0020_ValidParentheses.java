import java.util.Scanner;

public class LC0020_ValidParentheses {

    // Checks if parentheses are valid
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = -1;

        // Process each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++top] = ch;
            } else {
                if (top == -1)
                    return false;

                char open = stack[top--];
                if (!isMatching(open, ch)) {
                    return false;
                }
            }
        }

        return top == -1;
    }

    // Hides matching logic
    private boolean isMatching(char open, char close) {
        return (open == '(' && close == ')')
                || (open == '{' && close == '}')
                || (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0020_ValidParentheses sol = new LC0020_ValidParentheses();

        System.out.print("Enter parentheses string: ");
        String s = input.nextLine();

        System.out.println(sol.isValid(s));

        input.close();
    }
}
