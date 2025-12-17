public class AgeCalculation {
    public static void main(String[] args) {
        //declaring variables to store birth year and current year
        int birthYear, currYear;

        //assigning birth year and current year values
        birthYear = 2000;
        currYear = 2024;
        int currAge = currYear - birthYear;

        //displaying current age in current year
        System.out.println("Harry's age in " + currYear + " is " + currAge);
    }
}