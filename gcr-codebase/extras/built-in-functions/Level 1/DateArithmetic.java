import java.time.LocalDate;
import java.util.Scanner;
public class DateArithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = input.nextLine();

        if (inputDate.matches("\\d{4}-\\d{2}-\\d{2}")) {
            LocalDate date = LocalDate.parse(inputDate);
            LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
            
            System.out.println("Original date: " + date);
            System.out.println("Modified date: " + modifiedDate);
        } else {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
        }
        input.close();
    }
}
