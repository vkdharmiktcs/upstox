package exception_handling;

public class SIOBE {
	public static void main(String [] args){
		
		String s1="velocity";
		try {
			System.out.println(s1.charAt(8));
			
			}
		catch (StringIndexOutOfBoundsException a) {
			System.out.println("idiot there is no data u trying to fetch");
			
		}
	
		
	}

}
