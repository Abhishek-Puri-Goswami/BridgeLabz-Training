import java.util.Scanner;

class PerimeterOfRectangle {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Perimeter Of Rectangle");
		
	System.out.print("Enter the length of Rectangle : ");
	double length = sc.nextDouble();
		
	System.out.print("Enter the Width of Rectangle : ");
	double width = sc.nextDouble();
	sc.close();

	System.out.println("The Perimeter Of Rectangle is : " + (2 * (length + width)));
    }
}