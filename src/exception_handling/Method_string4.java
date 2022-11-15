package exception_handling;

public class Method_string4 {
	public static void main(String [] args) {
		String s1="maharaja";
		String s2="MAHARAJA";
		String s3="mahar";
		
		//length()
		System.out.println(s1.length());
		//toUppercase()
		System.out.println(s1.toUpperCase());
		//toLowercase()
	      System.out.println(s2.toLowerCase());
	      //equals()
	      System.out.println(s1.equals(s2));
	      //equalIgnorecase()
	      System.out.println(s1.equalsIgnoreCase(s2));
	      //contains()
	      System.out.println(s1.contains(s3));
	      System.out.println(s2.contains(s3));
	      //charAt()
	      System.out.println(s2.charAt(0));
	      System.out.println(s2.charAt(7));
	      //indexOf()
	      System.out.println(s2.indexOf('M'));
	      System.out.println(s2.indexOf('A'));
	      
	}

}
