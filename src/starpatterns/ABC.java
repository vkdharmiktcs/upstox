package starpatterns;

public class ABC {
	public static void main(String [] args) {
		for(int a=1;a<=4;a++) {
			for(int b=1;b<=4;b++) {
				if(a==1 && b==1) {
					System.out.print("@");
				}
				else if(a==4 && b==4) {
					System.out.print("#");
				}
			else {
				System.out.print("*");
			}
		}
		System.out.println();
	}
	}
}
