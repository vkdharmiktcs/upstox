package starpattern1;

public class Pallindrome {
	public static void main(String [] args) {
		String org="OPPO";
		String rev="";
		for(int a=org.length()-1;a>=0;a--) {
			rev=rev+org.charAt(a);
			
		}
		System.out.println(rev);
		if(org.equals(rev)) {
			System.out.println("it is pallindrome");
		}
		else {
			System.out.println("it is not pallindrome");
				
		}
	}

}
