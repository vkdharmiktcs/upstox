package starpattern1;

public class Whit_space {
	public static void main(String [] args) {
		String name="G U N J A N";
		int count=0;
		
		for(int i=1;i<=name.length()-1;i++) {
			char u=name.charAt(i);
			if(u==' ') {
			count++;
			
			}
		}
		System.out.println(count);
	}

}
