package javaExamples;
import java.util.Scanner;
public class Test_08_Statement_switchcase {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Add");
		System.out.println("2. sub");
		System.out.println("3. mul");
		System.out.println("4. div");
		System.out.println("Enter first number:");
		int a = sc.nextInt();
		System.out.println("Enter second number:");
		int b = sc.nextInt();
		System.out.println("Enter your choice:");
		int ch = sc.nextInt();
		
		switch(ch) {
			case 1:
				System.out.println("Addition of two numbers is: " + (a + b));
				break;
			case 2:
				System.out.println("Subtraction of two numbers is: " + (a - b));
				break;
			case 3:
				System.out.println("Multiplicaton of two numbers is: " + (a * b));
				break;
			case 4:
				 // Check for division by zero
                if(b != 0) {
                    System.out.println("Division of two numbers is: " + (a / b));
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                }
                break;
		default:
			System.out.println("Invalid choice !!!");
		}
		sc.close();
	}
}
