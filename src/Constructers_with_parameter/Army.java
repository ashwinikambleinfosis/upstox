package Constructers_with_parameter;

public class Army {
	
	String gunName;
	int noOfBullets;
	
	public Army(String gunName,int noOfBullets) {
		
		this.gunName=gunName;
		this.noOfBullets=noOfBullets;
	}

	public void fire() {
		for(int i=1; i<=noOfBullets; i++) {
			System.out.println("Dhad-Dhad-Dhad");
		}
	}
}
