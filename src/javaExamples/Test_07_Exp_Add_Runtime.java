package javaExamples;
import java.util.Scanner;
public class Test_07_Exp_Add_Runtime {
	public static void main(String args[]) {
		int a,b,c;
		System.out.println("Enter the value of a & b: ");
		Scanner Obj = new Scanner(System.in);
		a=Obj.nextInt();
		b=Obj.nextInt();
		c=a+b;
		System.out.println("Addition of 2 no is: " + c);
		Obj.close();
	}
}


/** 

		int a,b,c;
		System.out.print("Enter the value of a: ");
		Scanner Obj1 = new Scanner(System.in);
		a=Obj1.nextInt();
		System.out.print("Enter the value of b: ");
		Scanner Obj2 = new Scanner(System.in);
		b=Obj2.nextInt();


**/