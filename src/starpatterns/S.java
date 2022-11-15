package starpatterns;

public class S {
	public static void main(String [] args) {
		for(int i=1;i<=4;i++) {
			for(int a=1;a<=4;a++) {
				if(i==1&&a==1) {
					System.out.print("@");
					
				}
				else if(i==4&&a==4) {
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
