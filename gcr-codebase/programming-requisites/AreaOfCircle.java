import java.util.Scanner;

class AreaOfCircle {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Area of a circle");
		
	System.out.print("Enter the radius of circle : ");
	double radius = sc.nextDouble();
	sc.close();		

	double circleArea = Math.PI * radius * radius;
	System.out.println("Area of Circle is : " + circleArea);
    }
}
		