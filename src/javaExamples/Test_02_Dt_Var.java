package javaExamples;

public class Test_02_Dt_Var {
	int b=34; 			// instance variable: defined outside in a method but inside in a class.
	static int empid= 101;		// Static/Class variable

// Non-static method: 	
	public void m1() {
		int a=10;		// local variable: Define within a method & able to access within a method.
		System.out.println("m1 Executed");
		System.out.println(a + " ----> Local Variable");					// + is the concatenation operator 
		System.out.println(empid + " ----> Static/Class Variable");			//   between Variables & Strings.
	}
	public void m2() {
		System.out.println("m2 Executed");
		System.out.println(b + " ----> Instance Variable");
		System.out.println(empid + " ----> Static/Class Variable");
	}
	public void m3() {
		System.out.println("m3 Executed");
		System.out.println(b + " ----> Instance Variable");
	}	
// static method:
	public static void st(){
		System.out.println("Static method has been Executed.");
	}
	
	
public static void main(String args[]) {
	System.out.println("main method is Executed Successfully.");
// Non-static method: Access by using Object.	
	Test_02_Dt_Var Obj = new Test_02_Dt_Var();
	Obj.m1();
	Obj.m2();
	Obj.m3();
// static method: No need to create Object, access by using ClassName.
	Test_02_Dt_Var.st();
}
}
