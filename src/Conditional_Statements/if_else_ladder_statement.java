package Conditional_Statements;

public class if_else_ladder_statement {
	
public static void main(String[] args) {
	
	int marks=79;
	if(marks>=75) {
		System.out.println("passed in 1st class with distinction");
	}
	else if(marks>=60) {
		System.out.println("passed in 1st class");
	}
	else if(marks>=50) {
		System.out.println("passed in 2nd class");
	}
	else if(marks>=40) {
		System.out.println("passed in 3rd class");
	}
	else if(marks>=35) {
		System.out.println("passed");
	}
	else {
		System.out.println("fail");

    }
}

}
