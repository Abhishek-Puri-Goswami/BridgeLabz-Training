public class DistributionOfPens {
    public static void main(String[] args) {
        //Creating variables to store distribution details
        int numOfPens, numOfStudents;
        int pensPerStudent, remainingPens;

        //Assigning the given values 
        numOfPens = 14;
        numOfStudents = 3;
        //Calculating the number of pens per student
        pensPerStudent = numOfPens / numOfStudents;
        //Calculating the remaining pens
        remainingPens = numOfPens % numOfStudents;

        //Displaying the results
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}