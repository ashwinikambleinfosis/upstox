package Conditional_Statements;

public class Hostel_switch {
	
public static void main(String[] args) {
	
	switch("IDLI") {
	
	case "IDLI":{
	    System.out.println("On Monday");
	    break;
	}
	
	case "idli":{
	    System.out.println("On Tuesday");	
        break;
	}
	
	case "Uttapa":{
	    System.out.println("On Wednesday");	
        break;
	}
	
	case "Lemon Rice":{
	    System.out.println("On Thursday");	
        break;
	}
	
	case "Poha":{
	    System.out.println("On Friday");	
        break;
	}
	
	case "Dosa":{
	    System.out.println("On saturday");	
	    break;
	}
	default:{
	    System.out.println("No breakfast");	
        break;
	
	}
}

}
}
