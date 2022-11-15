package exception_handling;

public class AB1 {
	public static void main(String [] args) throws InterruptedException {
		
		int a=20;
		int b=0;
		
		try {
			int c=a/b;
			
		}
		catch (ArithmeticException g) {
			System.out.println("idiot with enter denometer");
		}
		Thread.sleep(3000);
		
	}

}
