package starpatterns;

public class X {
	public static void main(String [] args) {
		for(int a=1;a<=3;a++) {
			for(int b=1;b<=4;b++) {
				if(a==1||a==3||b==1||b==4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
