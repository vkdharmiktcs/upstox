package exception_handling;

public class Demo {
	public static void main(String [] args) {
		int a=20;
		int b=0;
		
		try {
			int c=a/b;
			
		}
		catch(ArithmeticException E) {
			System.out.println("hey user exception is handle");
		}
	}

}
