package Logical_Programs;

import java.util.Scanner;

public class Even_no {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter num");
		
		int num=s.nextInt();
		if(num%2==0) {
			System.out.println("Even no");
			
		}
		else {
			System.out.println("Odd no");
		}
	}

}
