package scanner_class;

public class Reverse {
	public static void main(String [] args) {
	String org="vivek";
	String rev="";
	for(int i=org.length()-1;i>=0;i--) {
		rev=rev+org.charAt(i);
		
	}
	System.out.println(rev);
	if(org.equals(rev)) {
		System.out.println("is pallindrome");
	}
	System.out.println("is not pallindrome");
	}

}
