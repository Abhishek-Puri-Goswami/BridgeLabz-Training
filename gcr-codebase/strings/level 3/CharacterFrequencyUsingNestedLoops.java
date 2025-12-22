import java.util.Scanner;
public class CharacterFrequencyUsingNestedLoops {
    // Method to find the frequency of characters in a string using nested loops
    public static String[] findCharacterFrequencies(String text) {
        char[] charArr = text.toCharArray();
        int[] frequencies = new int[charArr.length];

        // Outer loop to iterate through each character
        for (int i = 0; i < charArr.length; i++) {
            // Skip already counted characters
            if (charArr[i] != '0') {
                // Initialize frequency to 1 
                frequencies[i] = 1; 

                // Inner loop to check for duplicates
                for (int j = i + 1; j < charArr.length; j++) {
                    if (charArr[i] == charArr[j]) {
                        frequencies[i]++;
                        charArr[j] = '0'; // Mark duplicate characters as '0'
                    }
                }
            }
        }

        // Count unique characters for result array size
        int uniqueCount = 0;
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] != '0') {
                uniqueCount++;
            }
        }

        // Create a 1D String array to store characters and their frequencies
        String[] result = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] != '0') {
                result[index] = charArr[i] + "\t  | \t" + frequencies[i];
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
        String[] frequencies = findCharacterFrequencies(text);

        // Display the character frequencies
        System.out.println("Character | Frequency");
        System.out.println("----------------------");
        for (String pair : frequencies) {
            System.out.println("    " + pair);
        }
        input.close();
    }
}
