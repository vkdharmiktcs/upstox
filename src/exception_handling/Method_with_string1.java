package exception_handling;

public class Method_with_string1 {
	public static void main(String [] args) {
		String s1="nagpur";
		String s2="NAGPUR";
		String s3="nagp";
		
		//length()
		System.out.println(s1.length());
		
		//toUpperCase()
		System.out.println(s1.toUpperCase());
		
		//toLowercase()
		System.out.println(s2.toLowerCase());
		
		//equal()
		System.out.println(s1.equals(s2));
		
		//equalignorecase()
		System.out.println(s1.equalsIgnoreCase(s2));
		
		//contains()
		System.out.println(s1.contains(s3));
		System.out.println(s2.contains(s3));
		
		//charAt()
		System.out.println(s2.charAt(3));
		System.out.println(s2.charAt(0));
		
		//indexof()
		System.out.println(s2.indexOf("P"));
		System.out.println(s2.indexOf("N"));
	}

}
