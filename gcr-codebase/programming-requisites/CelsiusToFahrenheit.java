import java.util.Scanner;

class CelsiusToFahrenheit{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Celsius To Fahrenheit Convertor");
		
	System.out.print("Enter the temperature in Celsius : ");
	double celsius = sc.nextDouble();
	sc.close();

	double fahrenheit = (celsius * 9 / 5) + 32;		
	System.out.println("Temperature in Fahrenheit is : " + fahrenheit);
    }
}
		