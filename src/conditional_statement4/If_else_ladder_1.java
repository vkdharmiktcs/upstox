package conditional_statement4;

public class If_else_ladder_1 {
	public static void main(String [] args) {
		
		int marks=70;
		if(marks>=60) {
			System.out.println("student with 1st class with distinction");
			
		}
		else if (marks>=60) {
			System.out.println("student is 1st class");
			
		}
		else if (marks>=50) {
			System.out.println("student is 2nd class");
		}
		else if (marks>=40) {
			System.out.println("student is 3rd class");
		}
		else if (marks>=35) {
			System.out.println("student is pass");
		}
		else {
			System.out.println("fail");
		}
	}

}
