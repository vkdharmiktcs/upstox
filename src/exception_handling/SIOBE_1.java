package exception_handling;

public class SIOBE_1 {
	public static void main(String [] args) throws InterruptedException  {
		
		String s1="Nagpur";
		
		try {
			System.out.println(s1.charAt(6));
			
		}
		catch (StringIndexOutOfBoundsException a) {
			System.out.println("exception handling process");
		}
		Thread.sleep(3000);
	}

}
