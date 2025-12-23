import java.util.Scanner;

public class MostFrequentCharacter {

    public static char findFrequentCharacter(String str) {
        String temp = str.toLowerCase();
        int[] arr = new int[256];

        char result = ' ';
        int max = 0;
        for(int i=0; i<temp.length(); i++) {
            char ch = temp.charAt(i);
            arr[ch]++;
            if(arr[ch] > max) {
                max = arr[ch];
                result = ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = input.nextLine();

        char result = findFrequentCharacter(str);

        System.out.println("Most Frequent Character: " + result);

        input.close();
    }
}
