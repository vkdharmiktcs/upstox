package exception_handling;

public class Finally1 {
	public static void main(String [] args) {
		int a=20;
		int b=0;
		try {
			System.out.println("i am try block");
		}
		catch (ArithmeticException s)
		{
			System.out.println("enter with denometer");
			System.out.println("exceptiion is handle");
		}
		finally {
			System.out.println(" thank you for atm");
		}
		
	}

}
