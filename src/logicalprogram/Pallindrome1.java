package logicalprogram;

public class Pallindrome1 {
	public static void main(String [] args) {
		String org="GOG";
		String rev="";
		for(int i=org.length()-1;i>=0;i--) {
			rev=rev+org.charAt(i);
			
		}
		System.out.println(rev);
		if(org.equals(rev)){
			System.out.println("string is pallindrom");
		}
		else {
			System.out.println("string is not pallindrom");
		}
	}

}
