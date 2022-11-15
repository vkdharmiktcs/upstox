package exception_handling;

public class Throwable {
	public static void main(String [] args) {
		String s1="velocity";
		String s2="VELOCITY";
		String s3= "velo";
		
	//length()
		System.out.println(s1.length());
		//toLowercase()
		System.out.println(s1.toLowerCase());
		//toUppercase()
		System.out.println(s1.toUpperCase());
		//equals()
		System.out.println(s1.equals(s2));
		//equalsignorecase()
		System.out.println(s1.equalsIgnoreCase(s2));
		//contains()
		System.out.println(s1.contains(s3));
		System.out.println(s2.contains(s3));
		//charAt()
		System.out.println(s2.charAt(1));
		//indexof()
		System.out.println(s2.indexOf('E'));
		//lastIndexOf()
		System.out.println(s1.lastIndexOf('t'));
		//startwith()
		System.out.println(s1.startsWith("ve"));
		//substring()
		System.out.println(s1.substring(3));
		//concat()
		System.out.println(s1.concat(s3));
		//replace()
		System.out.println(s1.replace("city", "BMW"));
		//replaceall()
		System.out.println(s3.replaceAll(s2, s3));
		
	}

}
