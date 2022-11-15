package conditional_statement4;

public class Else_ladder_ {
	public static void main(String []args) {
		int marks=60;
		if(marks>=70) {
			System.out.println("pass with 1st class with distnction");
			
			
		}
		else if(marks>=60) {
			System.out.println("pass with 1st class");
		}
		else if (marks>=50) {
			System.out.println("pass with 2 nd class");
			
		}
		else if (marks>=40) {
			System.out.println("pass with 3rd class");
			
		}
		else if (marks>=35) {
			System.out.println("pass");
			
		}
		else {
			System.out.println("fial");
		}
	}

}
