import java.util.Scanner;
public class ToggleCase {
    public static String toggleCaseCharacters(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += Character.toString((char) (ch + 32));
            } else if (ch >= 'a' && ch <= 'z') {
                result += Character.toString((char) (ch - 32));
            } else {
                result += Character.toString(ch);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = input.nextLine();

        String result = toggleCaseCharacters(str);

        System.out.println("The toggle case of the given string " + str + " is: " + result);
        input.close();
    }
}
