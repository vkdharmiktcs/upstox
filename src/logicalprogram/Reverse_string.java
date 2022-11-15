package logicalprogram;

public class Reverse_string {
	public static void main(String[] args) {
	String org="AISHWARYA";
	String rev="";
	for(int a=org.length()-1;a>=1;a--) {
		rev=rev+org.charAt(a);
		
	}
	System.out.println(rev);
	}

}
