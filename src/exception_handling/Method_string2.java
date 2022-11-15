package exception_handling;

public class Method_string2 {
	public static void main(String [] args) throws InterruptedException {
		String s1="velocity";
		String s2="VELOCITY";
		String s3="velo";
		
		//length()
		System.out.println(s1.length());
		
		//toUppercase();
		System.out.println(s1.toUpperCase());
		
		//toLowercase()
		System.out.println(s2.toLowerCase());
		
		//equals()
		System.out.println(s1.equals(s2));
		
		//equalIgnorecase()
		System.out.println(s1.equalsIgnoreCase(s2));
		
		//containS()
		System.out.println(s1.contains(s3));
		System.out.println(s2.contains(s3));
		
		//charAt()
		System.out.println(s2.charAt(1));
		System.out.println(s2.charAt(6));
		
		//indexOf()
		System.out.println(s2.indexOf('Y'));
		System.out.println(s2.indexOf('V'));
		Thread.sleep(3000);
	}

}
