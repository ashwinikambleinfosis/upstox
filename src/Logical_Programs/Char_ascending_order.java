package Logical_Programs;

public class Char_ascending_order {
	public static void main(String[] args) {
		
		String s="ashwini";
		for(int i=97;i<=122;i++) {
			for(int j=0; j<s.length();j++) {
				if(s.charAt(j)==i) {
					System.out.println(s.charAt(j));
				}
			}
		}
	}

}
