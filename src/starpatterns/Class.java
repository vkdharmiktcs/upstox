package starpatterns;

public class Class {
	public static void main(String [] args) {
		for(int a=1;a<=4;a++) {
			for(int b=1;b<=4;b++) {
				if(b==1|b==4||b==a) {
					System.out.print("N");
				}
				else {
				System.out.print(" ");
					
				}
			}
			System.out.println();
		}
	}

}
