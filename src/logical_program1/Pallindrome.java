package logical_program1;

public class Pallindrome {
	public static void main(String [] args) {
		String org="NITIN";
		String rev="";
		for(int i=org.length()-1;i>=0;i--) {
			rev=rev+org.charAt(i);
			
		}
		System.out.println(rev);
		if(org.equals(rev)) {
			System.out.println("name is pallindrome");
		}
		else {
			System.out.println(" name is not pallindrome");
		}
	}

}
