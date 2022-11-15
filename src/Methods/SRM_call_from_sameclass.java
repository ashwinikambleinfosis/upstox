package Methods;

public class SRM_call_from_sameclass {
	
public static void main(String[] args) {
	
	System.out.println("Main method is started");
       m1();
       m2();
       m3();
    System.out.println("Main method is ended");
}
   
    public static void m1() {
    	System.out.println("I am running from regular method m1");
    }
    	
    public static void m2() {
    	System.out.println("I am running from regular method m2");
	
    }
    public static void m3(){
    	System.out.println("I am running from regular method m3");
    }

}


