package Conditional_Statements;

public class if_else_ladder_state1 {
	
public static void main(String[] args) {
	
	int boyage=25;
	int girlage=21;
	
	if(boyage>=21 && girlage>=18) {
		
		System.out.println("Both are eligible for marriage");
	}
	else if(boyage>=20 && girlage<17) {
		
		System.out.println("Boy is eligible but girl is not eligible for marriage");
	}
	else if(boyage<20 && girlage>=18) {
		
		System.out.println("Girl is eligible but boy is not eligible for marriage");
    }
	else {
		System.out.println("Both are not eligible for marriage");

	}

}

}
