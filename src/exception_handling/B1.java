package exception_handling;

public class B1 {
	public static void main(String [] args) {
		int a=10;
		int b=0;
		try {
			int c=a/b;
			
		}
		catch (ArithmeticException aman)
		{
			System.out.println("hi how are you");
			System.out.println("exception handle");
			
		}
	}
}