package Practise;

public class space {
	public static void main(String[] args) {
		
	
	String str="R amesh A kash";
	int count=0;
	
	for(int i=1;i<=str.length()-1;i++) {
		char ch=str.charAt(i);
		if(ch==' ') {
		count++;
		}	
	}
		System.out.println(count);
		
	}
	}
	
	


