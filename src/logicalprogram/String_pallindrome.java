package logicalprogram;

public class String_pallindrome {
	public static void main(String [] args) {
		String org="vinay";
		String rev="";
		for(int a=org.length()-1;a>=0;a--) {
			rev=rev+org.charAt(a);
			
		}
		System.out.println(rev);
		if(org.equals(rev)) {
			System.out.println("string is pallindrom");
		}
		else {
			System.out.println("string is not pallindrom");
		}
	}

}
