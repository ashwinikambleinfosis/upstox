package collection;

import java.util.Vector;

public class vector {
	public static void main(String[] args) {
	
	Vector v= new Vector();
	v.add("Mamata");
	v.add(100);
	v.add('A');
	v.add(null);
	v.add(null);
	System.out.println(v);
	System.out.println(v.size());
		System.out.println(v.isEmpty());
		v.add(1,500);
		System.out.println(v);
		v.remove(1);
		System.out.println(v);
		
	}

}
