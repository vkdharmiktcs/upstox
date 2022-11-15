package logical_program1;

public class Primenumber3 {
	public static void main(String [] args) {
		int num=7;
		int count=0;
		for(int s=1;s<=num;s++) {
			if(num%s==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("num is prime");
		}
		else {
			System.out.println("num is not prime");
		}
	}

}
