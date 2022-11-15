package exception_handling;

public class Demo3 {
	public static void main(String [] args) throws InterruptedException {
		int a=20;
		int b=0;
		try {
			int c=a/b;
			
		}
		catch(RuntimeException e) {
			System.out.println("exception is handle ");
			Thread.sleep(3000);
		}
	}

}
