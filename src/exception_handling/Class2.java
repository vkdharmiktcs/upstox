package exception_handling;

public class Class2 {
	public static void main(String [] args)  {
		String s1="velocity";
		try {
			
		
      System.out.println(s1.charAt(8));
	}
		catch (StringIndexOutOfBoundsException a) {
			System.out.println("exception is handled");
		}
		
	}
}
