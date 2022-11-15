package exception_handling;

public class SIOBE2 {
	public static void main(String [] args) throws InterruptedException  {
		
		String s1="velocity";
		
		try {
		
		System.out.println(s1.charAt(8));
		}
		catch (StringIndexOutOfBoundsException s) {
			System.out.println("exception handling to process");
		}
		Thread.sleep(3000);
	}
	

}
