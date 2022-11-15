package Practise;

public class reverse_string {
	public static void main(String[] args) {
		
		/*String s="dad";
		String rev=" ";
		for(int i=s.length()-1;i>=0;i--){
		rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
//check whether it is palindrome 
	if(s.equals(rev)) {
		System.out.println("given string is palindrome");
	}
	else {
		System.out.println("given string is not palindrome");
	}
	}*/
			int num=5;
			int count=0;
			for(int i=1;i<=num;i++){
			if(num%i==0){
			count++;
			}
			}
			if(count==2){
			System.out.println("num is prime");
			}
			else {
			System.out.println("num is not prime");
			}
	
	}
}
