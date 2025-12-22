import java.util.Scanner;
public class CharTypeInString {
    // Method to find the length of a string without using length()
    public static int findStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception indicates end of the string
            return count;
        }
    }

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkVowelOrConsonant(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); // Convert uppercase to lowercase
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to process string and return a 2D array with character types
    public static String[][] processString(String text) {
        int length = findStringLength(text);
        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkVowelOrConsonant(ch);
        }

        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayTable(String[][] table) {
        System.out.printf("%-10s%-15s%n", "Character", "Type");
        System.out.println("-----------------------");
        for (String[] row : table) {
            System.out.printf("%-10s%-15s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Input a string
        String str = input.nextLine();

        // Store the results
        String[][] characterTypes = processString(str);

        // Display the results
        displayTable(characterTypes);
        input.close();
    }
}
