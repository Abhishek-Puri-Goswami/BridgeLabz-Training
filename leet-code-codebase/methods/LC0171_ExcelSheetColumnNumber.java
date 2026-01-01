import java.util.Scanner;
public class LC0171_ExcelSheetColumnNumber {
    // Converts an Excel column title to its number
    public int titleToNumber(String columnTitle) {
        int result = 0;

        // Convert each character to its numeric value
        for (int i = 0; i < columnTitle.length(); i++) {
            char ch = columnTitle.charAt(i);
            result = result * 26 + (ch - 'A' + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0171_ExcelSheetColumnNumber sol = new LC0171_ExcelSheetColumnNumber();

        System.out.print("Enter column title: ");
        String columnTitle = input.nextLine();

        System.out.println(sol.titleToNumber(columnTitle));
        input.close();
    }
}
