package logicalprogram;

public class Pallindrome2 {
	public static void main(String [] args) {
		String abc="NITIN";
		String cba="";
		for(int a=abc.length()-1;a>=0;a--) {
		 cba=cba+abc.charAt(a);
		 
		}
		System.out.println(cba);
		if(abc.equals(cba)) {
			System.out.println("string is pallindrome");
		}
		else {
			System.out.println("string is not pallindromoe");
		}
	}

}
