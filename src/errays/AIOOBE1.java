package errays;

public class AIOOBE1 {
	public static void main(String [] args) {
		String ar[]=new String [4];
		ar[0]="vinay";
		ar[1]="vivek";
		ar[2]="aman";
		ar[3]="anish";
		// to print 1
		try {
			System.out.println(ar[4]);
		}
		catch(ArrayIndexOutOfBoundsException s) {
			System.out.println("exception is done");
		}
		
	}

}
