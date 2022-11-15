package exception_handling;

public class Method_of_string {
	public static void main(String [] args) throws InterruptedException  {
		String s1="velocity";
		String s2="VELOCITY";
	String s3="velo";
		//length()
		System.out.println(s1.length());
		//toUppercase()
		System.out.println(s1.toUpperCase());
		//toLowercase()
		System.out.println(s2.toLowerCase());
		//equals()
		System.out.println(s1.equals(s2));//false
		//equalIgnorecase()
		System.out.println(s1.equalsIgnoreCase(s2));//true
		//contains()
		System.out.println(s1.contains(s3));//true
		System.out.println(s2.contains(s3));
		//charAt()
		System.out.println(s2.charAt(0));//v
		System.out.println(s2.charAt(1));//e
		//indexOf()
		System.out.println(s2.indexOf('Y'));//7
		System.out.println(s2.indexOf('V'));//0
		Thread.sleep(3000);
	}

}
