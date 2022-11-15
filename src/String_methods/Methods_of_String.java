package String_methods;

public class Methods_of_String {
	public static void main(String[] args) throws Throwable {
		
        String s1="velocity";
		String s2="VELOCITY";
		String s3="velo";
		//length()
		System.out.println(s1.length());
		//toUppercase()
		System.out.println(s1.toUpperCase());
		//toLowercase()
		System.out.println(s2.toLowerCase());
		//equals()
		System.out.println(s1.equals(s2));
		//equalIgnorecase()
		System.out.println(s1.equalsIgnoreCase(s2));
		//contains()
		System.out.println(s1.contains(s3));
		//charAt
		System.out.println(s2.charAt(5));
		//indexOf()
		System.out.println(s2.indexOf('Y'));
		System.out.println(s2.indexOf('C'));
		Thread.sleep(3000);

}
}
