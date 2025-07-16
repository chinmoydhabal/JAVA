package javaExamples;

public class Test_10_Polymorphism_2_Runtime_Overriding1 extends Test_10_Polymorphism_2_Runtime_Overriding{
	public void add(int a, int b) {
		System.out.println(a-b);
		System.out.println("New Features");
	}
	
	public static void main(String args[]) {
		Test_10_Polymorphism_2_Runtime_Overriding1 Obj = new Test_10_Polymorphism_2_Runtime_Overriding1();
		Obj.add(30, 20);
	}
}
