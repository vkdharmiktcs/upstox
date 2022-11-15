package exception_handling;

public class Demo2 {
	public static void main(String [] args) throws InterruptedException {
		int a=10;
		int b=0;
		try {
			int c=a/b;
			
		}
		catch(ArithmeticException e) {
			System.out.println("exception is handle");
			Thread.sleep(3000);
		}
	}

}
