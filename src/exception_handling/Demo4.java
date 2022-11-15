package exception_handling;

public class Demo4 {
	public static void main(String [] args) {
		int a=20;
		int b=0;
		
		try {
			int c=a/b;
			
		}
		catch(ArithmeticException s) {
			System.out.println("idiot with denometer");
			System.out.println("exception is handling");
		}
	}

}
