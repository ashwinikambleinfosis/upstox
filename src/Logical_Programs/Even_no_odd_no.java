package Logical_Programs;

public class Even_no_odd_no {
	public static void main(String[] args) {
		
		int num=50;
		int count=0;
		for(int i=1;i<=num;i++) {
			count++;
			
			/*if(count%2==0) {
				
				System.out.println(i);
				
			}*/
			 if(count%2!=0) {
				System.out.println(i);
				
			}
			else {
				System.out.println();
			}
			
		}
	}

}
