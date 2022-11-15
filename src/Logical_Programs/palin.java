package Logical_Programs;

public class palin {
	public static void main(String[] args) {
		
		String org="advik";
		String rev="";
		for(int i=org.length()-1;i>=0;i--) {
			
			rev=rev+org.charAt(i);
		}
			System.out.println(rev);
			if(org.equals(rev)) {
				System.out.println("is palin");
			}
			else {
				System.out.println("is not palin");
			}
			
		}
	

}
