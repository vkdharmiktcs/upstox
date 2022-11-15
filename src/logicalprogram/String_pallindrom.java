package logicalprogram;

public class String_pallindrom {
	public static void main(String [] args) {
		String org="VIVEK";
		String rev="";
		for(int i=org.length()-1;i>=0;i--) {
			rev=rev+org.charAt(i);
			
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
