class Parent {
	int a=20;
	
	void displayparent() {
		System.out.println("Parent a is:"+a);
	}
}

class Child extends Parent{
	int b=30;
	
	void displaychild() {
		System.out.println("Parent a is:"+a);
		System.out.println("Child b is:"+b);
	}
}



public class Singleinheritance {
	public static void main(String[] args) {
		Child c1 = new Child();
		
		c1.displaychild();
		c1.displayparent();
	}
}
