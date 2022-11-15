package exception_handling;

public class Demo5 {
	public static void main(String [] args) throws InterruptedException   {
		int a =20;
		int b=0;
		try {
			int c=a/b;
			
		}
		catch (ArithmeticException S)
		{
			System.out.println("enter with denometer");
			System.out.println("exception with handling ");
			Thread.sleep(3000);
		}
	}

}
