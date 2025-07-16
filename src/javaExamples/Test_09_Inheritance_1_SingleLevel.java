package javaExamples;

class test {
	public void method1() {
		System.out.println("Hai...");
		System.out.println("parent class");
	}
}


public class Test_09_Inheritance_1_SingleLevel extends test {
	public static void main(String args[]) {
		Test_09_Inheritance_1_SingleLevel Obj = new Test_09_Inheritance_1_SingleLevel();
		Obj.method1();
	}
}