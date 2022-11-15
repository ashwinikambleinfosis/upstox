package exception_handling;

public class B {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		try {
			int c=a/b;
		}
		catch(ArithmeticException monkey) {
			
			System.out.println("Idiot enter valid denominator");
			System.out.println("exception is handled");
		}
		
	}
}
