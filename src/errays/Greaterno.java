package errays;

public class Greaterno {
	public static void main(String [] arg) {
		int num=23456;
		int count=0;
		while(num>0) {
			if(num%10>0) {
				count++;
				
			}
			num=num/10;
			
		}
		System.out.println(count);
	}

}
