package javaExamples;

abstract class Bank{
	abstract void debit();
	abstract void credit();
}

class HDFC extends Bank{
	public void debit() {
		System.out.println("HDFC debit");
	}
	public void credit() {
		System.out.println("HDFC debit");
	}
}

class Icici extends Bank{
	public void debit() {
		System.out.println("Icici debit");
	}
	public void credit() {
		System.out.println("Icici debit");
	}
}


public class Test_12_Abstraction {
	public static void main(String args[]) {
		HDFC Obj1 = new HDFC();
		Obj1.debit();
		Obj1.credit();
		Icici Obj2= new Icici();
		Obj2.debit();
		Obj2.credit();
		
	}
}
