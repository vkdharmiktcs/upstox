package starpatterns;

public class N {
	public static void main(String [] args) {
		for(int a=1;a<=4;a++) {
			for(int b=1;b<=4;b++) {
				if(a==b) {
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
