package logicalprogram;

public class Demo {
	public static void main(String [] args) {
		String org="vinay";
		String rev="";
		for(int a=org.length()-1;a>=0;a--) {
			rev=rev+org.charAt(a);
			
		}
		System.out.println(rev);
	}

}
