package Constructers_with_parameter;

public class Ring {
	
	String ringName;
	int noOfTime;
	
	public Ring(String ringName,int noOfTime) {
		
		this.noOfTime=noOfTime;
		this.ringName=ringName;
		
	}
     public void start() {
    	 
    	 for(int i=1; i<=noOfTime;i++) {
    		 System.out.println("Tring-Tring");
    	 }
     }
}
