package javaExamples;

public class Test_06_ExpArray {							// Array is a group of similar element.
	public static void main(String args[]) {
		int arr[]= {10,20,30,40,50,60};
		for(int temp:arr) {							// temp is the temporary variable.
			System.out.println(temp);		// print full all the elements in a array.
		}
		System.out.println(arr[2]);					// print particular single element in a array.
	}
}