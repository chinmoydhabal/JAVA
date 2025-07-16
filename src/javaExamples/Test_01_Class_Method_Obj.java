package javaExamples;

public class Test_01_Class_Method_Obj {
	
	// m1,m2,m3 is method
	
	public void m1() {
		System.out.println("M1 method Executed");
	}
	public void m2() {
		System.out.println("M2 method Executed");
	}
	public void m3() {
		System.out.println("M3 method Executed");
	}
	
public static void main(String args[]) {
	System.out.println("main method has been Executed.");
	
	//	 className objectName = new className() ;
	// here m is a object
	Test_01_Class_Method_Obj m = new Test_01_Class_Method_Obj();
	m.m1();
	m.m3();
	m.m2();
}
}
