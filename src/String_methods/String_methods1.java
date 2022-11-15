package String_methods;

public class String_methods1 {
	
	public static void main(String[] args)throws Throwable{
		
		String s1="velocity";
		String s2="VELOCITY";
		String s3="velo";
		String s4="ASHWINI";
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s1.length());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.contains(s3));
		System.out.println(s1.concat(s3));
		System.out.println(s1.substring(2));
		System.out.println(s1.replace("velo","rural"));
		System.out.println(s1.charAt(1));
		System.out.println(s2.indexOf('T'));
		Thread.sleep(3000);
		System.out.println(s1.endsWith("ty"));
		System.out.println(s1.startsWith("v"));
		System.out.println(s4.lastIndexOf('I'));
	}

}
