package exception_handling;

public class Method_string {
	public static void main(String []    args) throws InterruptedException  {
		String s1="software";
		String s2="SOFTWARE";
	    String s3="soft";
	    
	    //length()
	    System.out.println(s1.length());
	    //toUppercase()
	    System.out.println(s1.toUpperCase());
	    //toLowercase()
	    System.out.println(s2.toLowerCase());
	    //equal()
	    System.out.println(s1.equals(s2));
	    //equalIgnorecasae()
	    System.out.println(s1.equalsIgnoreCase(s2));//true
	    //contains()
	    System.out.println(s1.contains(s3));//true
	    System.out.println(s2.contains(s3));
	    //charAt()
	    System.out.println(s2.charAt(0));//S
	    //indexOf()
	    System.out.println(s2.indexOf('R'));//
	    System.out.println(s2.indexOf('S'));
	    Thread.sleep(3000);
	    
	}

}
