package Scanner_programs;

import java.util.Scanner;

public class Demo_String {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter name:");
		
		String name=s.next();
		String correctname=name.replace("@","s");
		
		
		System.out.println(correctname);
		
	}

}

