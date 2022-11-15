package exception_handling;

public class Finally {
	public static void main(String [] args) {
		int a=10;
		int b=0;
		try {
			System.out.println("i am from try block");
			
		}
		catch  (ArithmeticException s)
		
		{
			System.out.println("enter with denometer");
			System.out.println("exception is handle");
		}
		finally {
			System.out.println("thank you for atm");
		}
		}
	}


