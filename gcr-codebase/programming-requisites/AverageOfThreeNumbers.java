import java.util.Scanner;

class AverageOfThreeNumbers {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Average of Three Numbers");
		
	System.out.print("Enter the first number : ");
	double num1 = sc.nextDouble();
		
	System.out.print("Enter the second number : ");
	double num2 = sc.nextDouble();
		
	System.out.print("Enter the third number : ");
	double num3 = sc.nextDouble();
	sc.close();		

	System.out.println("Average of these three numbers is : " + ((num1 + num2 + num3) / 3));
    }
}