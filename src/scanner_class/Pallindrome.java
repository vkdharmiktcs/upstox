package scanner_class;

public class Pallindrome {
	public static void main(String [] args) {
		String org="MOCCOM";
		String rev="";
		
		for(int s=org.length()-1;s>=0;s--) {
			rev=rev+org.charAt(s);
			
		}
		if(org.equals(rev)) {
			System.out.println("string is pallindrome");
		}
		else {
			System.out.println("string is not pallindrome");
		}
	}

}
