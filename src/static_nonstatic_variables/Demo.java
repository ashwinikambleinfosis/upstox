package static_nonstatic_variables;

public class Demo {
	
	static String s="Velocity";
	String s1="Ashwini";
	
public static void main(String[] args) {
	
	System.out.println(s);
	
	Demo d=new Demo();
	
	System.out.println(d.s1);
	
}

}
