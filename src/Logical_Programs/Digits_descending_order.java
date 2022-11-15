package Logical_Programs;

public class Digits_descending_order {
	public static void main(String[] args) {
		
		String s="254136";
		for(int i=57;i>=48;i--) {
			for(int j=0;j<s.length();j++) {
				if(s.charAt(j)==i) {
					System.out.println(s.charAt(j));
				}
			}
		}
	}

}
