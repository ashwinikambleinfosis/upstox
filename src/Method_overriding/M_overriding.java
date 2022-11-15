package Method_overriding;

public class M_overriding {//ULC
	
	public static void main(String[] args) {
		
		System.out.println("Take talk of cat");
		
		Cat c=new Cat();
		
		c.talk();
		
		System.out.println("Take talk of dog");
		
		Dog d=new Dog();
		
		d.talk();
	}

}
