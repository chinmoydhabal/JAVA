package javaExamples;

class programmer{
	public String name1;			// Public instance variable to store name
	
	// Constructor to initialize the 'name1' variable
	public programmer(String name) {
		name1=name;					// The 'name' parameter is assigned to the instance variable 'name1'
	}
	
	// Method to display the value of 'name1'
	public void displayName() {
		System.out.println("Name: "+name1);		// Prints the value of 'name1' to the console
	}
} 

public class Test_11_Encapsulation {
	public static void main(String args[]) {
		programmer Obj = new programmer("Chinmoy");		// Creating an object of 'programmer' class with name 'Chinmoy'
		Obj.displayName();			 // Calling 'displayName()' method to print the name
	}
}
