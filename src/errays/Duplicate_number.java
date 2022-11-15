package errays;

public class Duplicate_number {
	public static void main(String [] args) {
		String ss="24235363";
		int count=0;
		for (int i=0;i<ss.length();i++){
			
			for(int j=0;j<ss.length();j++)
				
			{
				if(ss.charAt(i)==ss.charAt(j)) {
					count++;
					
				}
			}
			if(count>=2) {
				System.out.println(ss.charAt(i) +" is repeated" + count +" times ");
			}
			count=0;
			
		}
			
		
		
		
	}

}
