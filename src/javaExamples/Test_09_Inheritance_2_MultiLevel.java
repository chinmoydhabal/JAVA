package javaExamples;

class A{
	int a=10;
	int b=20;
	public void method1() {
		System.out.println("Method-1 Executed");
	}	
}

class B extends A{
	int x=30;
	int y=40;
	public void method2() {
		System.out.println("Method-2 Executed");
		System.out.println(a+b);
	}
}

public class  Test_09_Inheritance_2_MultiLevel extends B{
	public void method3() {
		System.out.println("Method-3 Executed");
		System.out.println(x+y);	//class B
		System.out.println(a+b);	//class A
	}
	public static void main(String args[]) {
		Test_09_Inheritance_2_MultiLevel Obj = new Test_09_Inheritance_2_MultiLevel();
		Obj.method1();
		Obj.method2();
		Obj.method3();
	}
}