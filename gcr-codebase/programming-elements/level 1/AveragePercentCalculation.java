public class AveragePercentCalculation {
    public static void main(String[] args) {
        //Creating variables to store student marks details 
        double mathsMarks, physicsMarks, chemistryMarks;
        double averagePercentMarks, maxMarks = 300;

        //assigning subject marks values
        mathsMarks = 94;
        physicsMarks = 95;
        chemistryMarks = 96;
        //calculating total marks 
        double totalMarks = mathsMarks + physicsMarks + chemistryMarks;
        //calculating average percent marks
        averagePercentMarks = (totalMarks / maxMarks) * 100;

	//displaying the average percent marks
        System.out.println("Sam’s average mark in PCM is " + averagePercentMarks);
    }
}