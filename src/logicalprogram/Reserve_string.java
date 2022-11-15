package logicalprogram;

public class Reserve_string {
	public static void main(String [] args) {
		String org="Gunjan";
		String rev="";
		
		for(int i=org.length()-1;i>=0;i--) {
			rev=rev+org.charAt(i);
			
		}
		System.out.println(rev);
	}
}
