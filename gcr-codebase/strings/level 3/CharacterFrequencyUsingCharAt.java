import java.util.Scanner;
public class CharacterFrequencyUsingCharAt {
    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequencies(String text) {
        int[] frequency = new int[256]; // Array to store frequency of characters (ASCII size)

        // Loop to calculate frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }
        // Count the number of unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }
        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                if (i == 32) {
                    result[index][0] = "space";
                    result[index][1] = Integer.toString(frequency[i]);
                    index++;

                    continue;
                }
                result[index][0] = Character.toString((char) i);
                result[index][1] = Integer.toString(frequency[i]);
                index++;
            }
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
            System.out.printf("  %s\t | \t%s\n", pair[0], pair[1]);
        }

        input.close();
    }
}
