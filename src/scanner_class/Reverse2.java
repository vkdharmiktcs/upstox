package scanner_class;

public class Reverse2 {
	public static void main(String [] args) {
		String org="vinay";
		String rev="";
		for(int i=org.length()-1;i>=0;i--) {
			rev=rev+org.charAt(i);
			
		}
		System.out.println(rev);
	}

}
