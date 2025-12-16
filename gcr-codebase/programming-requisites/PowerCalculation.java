import java.util.Scanner;

class PowerCalculation {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Power Calculation");
		
	System.out.print("Enter the value of Base : ");
	double base = sc.nextDouble();
		
	System.out.print("Enter the value of Exponent : ");
	double exponent = sc.nextDouble();
	sc.close();
		
	System.out.println(base + " raised to the power of " + exponent + " is : " + Math.pow(base, exponent));
    }
}