package errays;

public class Class4 {
	public static void main(String [] args) {
		String ar[]=new String [4];
		ar[0]="vinay";
		ar[1]="vivek";
		ar[2]="aman";
		ar[3]="anish";
		ar[4]="karan";
		// to get entire data print not present
		try {
			System.out.println(ar[4]);
		}
		catch(ArrayIndexOutOfBoundsException s) {
			System.out.println("idiot there is not data still u r trying to fetch it means u r waste of fellow");
		}
		
	}

}
