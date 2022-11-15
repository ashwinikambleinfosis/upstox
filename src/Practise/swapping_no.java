package Practise;

public class swapping_no {
	public static void main(String[] args) {
	/*	//using 3rd variable
		int a=10;
		int b=20;
		int c=a;//10
		    a=b;//20
		    b=c;//10
		System.out.println("After swapping:"+a+"and"+b);
	}*/
//without using 3rd variable
	
	int a=10;
	int b=20;
	a=a+b;//10+20=30
	b=a-b;//30-20=10
	a=a-b;//30-10=20
	System.out.println("After swapping:"+a+"and"+b);
}
}
