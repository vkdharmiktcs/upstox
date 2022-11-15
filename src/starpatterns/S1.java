package starpatterns;

public class S1 {
	public static void main(String [] args) {
		for(int i=1;i<=3;i++) {
			for(int a=1;a<=4;a++) {
				if(i==1||i==3||a==1||a==4) {
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
