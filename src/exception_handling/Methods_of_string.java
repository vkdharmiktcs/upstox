package exception_handling;

public class Methods_of_string {
	public static void main(String [] args) {
		
		String s1="velocity";
		String s2="VELOCITY";
		String s3="velo";
		
		//last index of it will check of duplicate number
		System.out.println(s1.lastIndexOf('t'));
		
		//start with it will check of whether string is started with particular character or not 
		System.out.println(s1.startsWith("ve"));
		
		//ends with it will check of whether string is ends with particular character or not 
		System.out.println(s1.endsWith("ty"));
		
		//if we want to break the string substring 
		System.out.println(s1.substring(4));
		
		// how to concat two string 
		System.out.println(s1.concat(s3));
	
		//replace method will replace the string 
		System.out.println(s1.replace("city","rural"));
	
		
	}

}
