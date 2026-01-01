import java.util.Scanner;
public class LC0168_ExcelSheetColumnTitle {
    // Converts a column number to its Excel column title
    public String convertToTitle(int columnNumber) {
        String result = "";
        // Build the title from right to left
        while (columnNumber > 0) {
            columnNumber--;
            char ch = (char) ('A' + (columnNumber % 26));
            result = ch + result;
            columnNumber = columnNumber / 26;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0168_ExcelSheetColumnTitle sol = new LC0168_ExcelSheetColumnTitle();

        System.out.print("Enter column number: ");
        int columnNumber = input.nextInt();

        System.out.println(sol.convertToTitle(columnNumber));
        input.close();
    }
}
