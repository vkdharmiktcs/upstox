package conditional_statement4;

public class Else_ladder6 {
	public static void main(String [] args) {
		int marks=65;
		if(marks>=90) {
			System.out.println("pass with 1 st class with distinction");
			
		}
		else if(marks>=60) {
			System.out.println("pass with 1st class");
			
		}
		else if (marks>=50) {
			System.out.println("pass with 2nd class");
			
		}
		else if(marks>=40) {
			System.out.println("pass with 3rd class");
			
		}
		else if (marks>=35) {
			System.out.println("pass");
			
		}
		else {
			System.out.println("fail");
			
		}
	}

}
