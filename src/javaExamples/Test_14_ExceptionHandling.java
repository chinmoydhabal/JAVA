package javaExamples;

public class Test_14_ExceptionHandling {
	public static void main(String args[]) {
		
		// error 1
		try {									// try: use the identify the error
			int a= 10/0;						
			System.out.println(a);
		}
		catch (Exception e){					// catch(Exception e) : to print the error
			System.out.println(e);				// Exception : Super class of all predefined error messages
		}
		
		
		// error 2
		try {
			int arr[]= {10,20,30,40,50};
			System.out.println(arr[12]);
		}
		catch(Exception e1) {
			System.out.println(e1);
		}
	}
}
