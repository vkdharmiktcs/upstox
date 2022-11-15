package exception_handling;

public class Finally2 {
	public static void main(String [] args) {
		int a =10;
		int b=0;
		
		try {
			System.out.println("i am try block ");
		}
		catch (ArithmeticException s)
		{
			System.out.println("idiot with enter denometer");
			System.out.println("exception is handling ");
		}
		finally {
			System.out.println("thank you for atm");
		}
	}

}
