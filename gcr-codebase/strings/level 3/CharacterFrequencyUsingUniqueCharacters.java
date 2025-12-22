import java.util.Scanner;
public class CharacterFrequencyUsingUniqueCharacters {
    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String text) {
        int length = text.length();
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            // Check if the character is unique
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }

    // Method to find the frequency of unique characters in a string
    public static String[][] findCharacterFrequencies(String text) {
        int[] frequency = new int[256]; // Array to store frequency of characters (ASCII size)

        // Loop to calculate frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Find unique characters
        char[] uniqueChars = findUniqueCharacters(text);

        // Create a 2D array to store unique characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            if (uniqueChars[i] == 32) {
                result[i][0] = "space";
                result[i][1] = Integer.toString(frequency[uniqueChars[i]]);
                continue;
            }
            result[i][0] = Character.toString(uniqueChars[i]);
            result[i][1] = Integer.toString(frequency[uniqueChars[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Find character frequencies
        String[][] frequencies = findCharacterFrequencies(text);

        // Display the character frequencies
        System.out.println("Character | Frequency");
        System.out.println("----------------------");
        for (String[] pair : frequencies) {
            System.out.printf("  %s\t  | \t%s\n", pair[0], pair[1]);
        }
        input.close();
    }
}
