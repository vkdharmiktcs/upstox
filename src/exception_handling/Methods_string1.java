package exception_handling;

public class Methods_string1 {
	public static void main(String [] args) {
		
		String s1="velocity";
		String s2="VELOCITY";
		String s3="velo";
		
		//lastindexOf it will give index of duplicate character
		System.out.println(s1.lastIndexOf('t'));
		
		//startwith it will check whether string is started with particular character or not 
		System.out.println(s1.startsWith("ve"));
		
		//endswith it will check whether string is ends with particular character or not 
		System.out.println(s1.endsWith("ty"));
		
		//if we want to break the string substring
		System.out.println(s1.substring(4));
		
		//how to concat two string 
		System.out.println(s1.concat(s3));
		
		//repalce method will replace the string 
		System.out.println(s1.replace("city", "rural"));
	}

}
