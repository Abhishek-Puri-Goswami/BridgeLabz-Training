import java.util.Scanner;
public class RemoveCharacter {
    public static String removeCharacter(String str, char ch) {
        return str.replace(Character.toString(ch), "");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = input.nextLine();
        System.out.println("Enter the character which you want to remove from string: ");
        
        char ch = input.next().charAt(0);
        
        String result = removeCharacter(str, ch);
        System.out.println("Modified String: " + result);
        input.close();
    }
}
