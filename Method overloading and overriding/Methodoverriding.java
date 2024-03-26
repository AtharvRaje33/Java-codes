class Dog{

	void bark() {
		System.out.println("Parent dog is barking");
	}
}

class Childdog extends Dog{
	void bark() {
		System.out.println("Child dog is barking");
	}
}
public class Methodoverriding {
	public static void main(String[] args) {
		Childdog c = new Childdog();
		c.bark();
	
		
		Dog d = new Dog();
		d.bark();
		
		Dog d1 = new Childdog();   // upcasting	
		d1.bark();
		
		// Childdog c2 = new Dog(); is not possible
	}
}
