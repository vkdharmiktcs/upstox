package starpattern1;

public class Whitespace {
	public static void main(String [] args) {
		String name="A I S H W A R I Y A";
		int count=0;
		
		for(int i=0;i<=name.length()-1;i++) {
			char ch=name.charAt(i);
			
			if(ch==' ') {
				count++;
				
			}
		}
		System.out.println(count);
	}

}
