package Logical_Programs;

public class Digits_ascending_order {
	public static void main(String[] args) {
		
		String s="246135";
		for(int i=48;i<=57;i++) {
			for(int j=0;j<s.length();j++) {
				if(s.charAt(j)==i) {
					System.out.println(s.charAt(j));
				}
			}
		}
	}

}
