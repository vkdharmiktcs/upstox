package exception_handling;

public class SIOBE1 {
	public static void main(String [] args) throws InterruptedException  {
		
		String s1="velocity";
		
		try {
			System.out.println(s1.charAt(8));//we r tying to feth data which is not present 
			
		}
		catch (StringIndexOutOfBoundsException s) {
			System.out.println("exception handling process ");
		}
		Thread.sleep(3000);
		
		
		
		
		
		
		
}
}
