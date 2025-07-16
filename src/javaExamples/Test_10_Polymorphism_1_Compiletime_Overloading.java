package javaExamples;

public class Test_10_Polymorphism_1_Compiletime_Overloading {
	public void add(int a, int b) {		// add is the method name (Signature)
		System.out.println(a+b);
	}
	public void add(int a, int b,int c) {		// add is the method same as previous method name (signature is different)
		System.out.println(a+b+c);
	}											// method overloading: Can be implemented in one single class.
	
	public static void main(String args[]) {
		Test_10_Polymorphism_1_Compiletime_Overloading Obj = new Test_10_Polymorphism_1_Compiletime_Overloading();
		Obj.add(10, 20);
		Obj.add(10, 20, 30);
	}
}
