package collection;

import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add("Ankush");
		al.add(100);
		al.add('A');
		al.add(null);
		al.add(null);
		System.out.println(al);
		al.add(3500);
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.size());
	}

}
