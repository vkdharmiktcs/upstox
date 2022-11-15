package exception_handling;

public class Methods_String {
	public static void main(String [] args) {
		
		String s1="velocity";
		String s2="VELOCITY";
		String s3="velo";
		
		//Lastindexof it well check of duplicate character 
		System.out.println(s1.lastIndexOf('t'));
		
		//startwith it well check whether string is started with particular character or not 
		System.out.println(s1.startsWith("ve"));
		//endswith it well check whether string i s end with particular character or not 
		System.out.println(s1.endsWith("ty"));
		//if we break the string substring
		System.out.println(s1.substring(2));
		
		//how to concat two string
		System.out.println(s1.concat(s3));
		
		//replace method will replace the string 
		System.out.println(s1.replace("city","area"));
		
		
	}

}
