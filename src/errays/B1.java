package errays;

public class B1 {
	public static void main(String[] args) {
		String ar[]=new String [5];
		ar[0]="samantha";
		ar[1]="priya";
		ar[2]="kajal";
		ar[3]="sai pallavi";
		ar[4]="priyanka";
		//print the data is entire given data
		try {
		System.out.println(ar[5]);
	}
		catch (ArrayIndexOutOfBoundsException s) {
			System.out.println("idiot there is no data still u trying to fetch it means u ar waste fellow");
		}
		}

}
