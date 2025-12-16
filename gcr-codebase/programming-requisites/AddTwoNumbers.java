import java.util.Scanner;

class AddTwoNumbers {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Add Two Numbers");
		
	System.out.print("Enter the first number : ");
	int num1 = sc.nextInt();
	System.out.print("Enter the second number : ");
	int num2 = sc.nextInt();

	System.out.println("Sum is : " + (num1 + num2));
        sc.close();
    }
}