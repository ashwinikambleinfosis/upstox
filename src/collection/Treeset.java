package collection;

import java.util.TreeSet;

public class Treeset {
	
	public static void main(String[] args) {
		
		TreeSet t=new TreeSet();
		t.add(800);
		t.add(400);
		t.add(300);
		t.add(600);
		
		
		System.out.println(t);
		t.pollFirst();
		System.out.println(t);
		t.pollLast();
		System.out.println(t);
		
		
		
	}

}
