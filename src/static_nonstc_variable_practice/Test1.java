package static_nonstc_variable_practice;

public class Test1 {
	
	static char ch='A';
	       char x='B';
	     
public static void main(String[] args) {
	
	System.out.println(ch);
	
	Test1 y=new Test1();
	
	System.out.println(y.x);
}

}
