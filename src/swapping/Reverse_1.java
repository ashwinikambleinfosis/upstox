package swapping;

public class Reverse_1 {
	
	public static void main(String[] args) {
		
		String s="DAD";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
		if(s.equals(rev)) {
			System.out.println("Given string is palindrom");
			
				
			}
		else {
			System.out.println("Given string is not palindrom");
		}
		
	}

}
