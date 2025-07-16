package javaExamples;

public class Test_05_keywords_2_continue {
	public static void main(String args[]) {
		for(int i=10; i<=15; i++) {
			if(i==13)
				continue;		// continue statement: it will break current process & continue from next level.
		System.out.println(i);
		}
	}
}
