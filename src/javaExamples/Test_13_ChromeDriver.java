package javaExamples;

//***********************************Interface*************************************
interface WebDriver{
	public void openApp();
	public void closeApp();
}

class FirefoxDriver implements WebDriver{
	public void openApp() {
		System.out.println("Firefox Open");
	}
	public void closeApp() {
		System.out.println("Firefox Close");
	}
}

public class Test_13_ChromeDriver implements WebDriver{
	public void openApp() {
		System.out.println("Chrome Open");
	}
	public void closeApp() {
		System.out.println("Chrome Close");
	}
	
	public static void main(String args[]) {
		
		// method in class: directly creating the Object & access.
		
//		FirefoxDriver Obj1 = new FirefoxDriver();
//			Obj1.openApp();
//			Obj1.closeApp();
//		Test_13_ChromeDriver Obj2 = new Test_13_ChromeDriver();
//			Obj2.openApp();
//			Obj2.closeApp();
			
		
		// method in interface: we can't directly create obj:  Ref of interface
		
		WebDriver driver1 = new FirefoxDriver();
			driver1.openApp();
			driver1.closeApp();
		WebDriver driver2 = new Test_13_ChromeDriver();
			driver2.openApp();
			driver2.closeApp();
	}
}
