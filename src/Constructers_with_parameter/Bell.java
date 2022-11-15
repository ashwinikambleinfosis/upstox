package Constructers_with_parameter;

public class Bell {//BLC

	String bellName;
	int noOfTime;
	
	public Bell(String bellName,int noOfTime) {
		this.bellName=bellName;
		this.noOfTime=noOfTime;
	}
	
	public void ring() {
		
		for(int i=1; i<=noOfTime; i++) {
			System.out.println("Ting-Tong");
		}
		
	}
}
