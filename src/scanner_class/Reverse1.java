package scanner_class;

public class Reverse1 {
	public static void main(String [] args) {
		String org="aishwarya";
		String rev="";
		
		for(int s=org.length()-1;s>=0;s--) {
			rev=rev+org.charAt(s);
			
		}
		System.out.println(rev);
	}

}
