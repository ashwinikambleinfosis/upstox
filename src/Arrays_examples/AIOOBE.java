package Arrays_examples;

public class AIOOBE {

	public static void main(String[] args) {
		
		String ar[]=new String[5];
		      ar[0]="Samantha";
		      ar[1]="Rashmika";
		      ar[2]="SaiPallavi";
		      ar[3]="Niveda Thomas";
		      ar[4]="Kirthy Suresh";
		try {
			System.out.println(ar[5]);
		}
		catch(ArrayIndexOutOfBoundsException donky) {
			System.out.println("Idiot there is no data still u r trying to fetch it means ur waste fellow");
			
		}
	}
}
