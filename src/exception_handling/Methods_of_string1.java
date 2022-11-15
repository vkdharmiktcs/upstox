package exception_handling;

public class Methods_of_string1 {
	public static void main(String [] args) {
		String s1="velocity";
		String s2="VELOCITY";
		String s3="velo";
		
		//lastindexof 
		System.out.println(s1.lastIndexOf('y'));
		
		//startwith
		System.out.println(s1.startsWith("ve"));
		
		//endwith
		System.out.println(s1.endsWith("ty"));
		
		//string with substring
		System.out.println(s1.substring(3));
		
		//string concat with two string
		System.out.println(s1.concat(s3));
		
		//replace with 
		System.out.println(s1.replace("velo", "city"));
	}

}
