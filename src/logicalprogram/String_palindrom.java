package logicalprogram;

public class String_palindrom {
	public static void main(String[] args) {
		String org="NITIN";
		String rev="";
		for(int i=org.length()-1;i>=0;i--) {
			rev=rev+org.charAt(i);
			
		}
		System.out.println(rev);
		if(org.equals(rev)) {
			System.out.println("going is pallindrome");
		}
		else {
			System.out.println("going is not pallindrome");
		}
}
}
