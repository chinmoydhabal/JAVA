package javaExamples;

public class Test_03_Cond_4_nestedif {
	public static void main(String args[]) {
		
		boolean withLisence=false;
		boolean withHelmet=true;
		
		if (withLisence==true) {
			if(withHelmet==true) {
				System.out.println("You followed the driving rules.");
			}
			else {
				System.out.println("You are not maintained the Safe Drive Save Life rules,fine $50");
			}
	    }
		else {
			System.out.println("You are violating the driving rules, fine $1000");
		}

	}
}
