package logicalprogram;

public class Reverse_string1 {
	public static void main(String[] args) {
		String abc="VINAY";
		String cba="";
		for(int i=abc.length()-1;i>=0;i--) {
			cba=cba+abc.charAt(i);
			
			
		}
		System.out.println(cba);
	}

}
