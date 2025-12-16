import java.util.Scanner;

class VolumeOfCylinder {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Volume Of a Cylinder");
		
	System.out.print("Enter the radius of cylinder : ");
	double radius = sc.nextDouble();
		
	System.out.print("Enter the height of cylinder : ");
	double height = sc.nextDouble();
	sc.close();
		
	double cylinderVolume = Math.PI * radius * radius * height;
	System.out.println("The volume of Cylinder is : " + cylinderVolume);
    }
}