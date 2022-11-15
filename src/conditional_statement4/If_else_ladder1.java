package conditional_statement4;

public class If_else_ladder1 {
	public static void main(String [] args) {
		int marks=65;
		if(marks>=70) {
			System.out.println(" 1ST class with distinction");
			
		}
		else if (marks>=60) {
			System.out.println("pass with 1 st class");
			
		}
		else if (marks>=50) {
			System.out.println("pass with 2nd class");
			
		}
		else if (marks>=40) {
			System.out.println("pass with 3 rd class");
			
		}
		else if(marks>=35) {
			System.out.println("pass ");
			
		}
		else {
			System.out.println ("fail");
			
		}
	}
	

}
