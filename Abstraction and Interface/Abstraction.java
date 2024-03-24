// abstraction is showing only essential features to the user and hiding some details
// it is of 2 types - 100% and not 100% 
// abstract class cannot be used to create object
// abstract class is a template where variables and methods are declared as abstract
// abstract methods will not have a method body in the class that they are declared using the abstract keyword
// abstract method can only be created in an abstract class and not outside
// it can have constructors
// abstraction is incomplete without polymorphism :::::imp

abstract class Shape{
	static int noofshapes=0;
	
	Shape(){
		noofshapes++;
	}
	
	abstract void draw();  
	
	void displaytotalshapes() {
		System.out.println("Total shapes:"+noofshapes);
	}
	
	void displayinfo() {
		System.out.println("This is a shape");
	}
}

class Circle extends Shape{

	@Override
	void draw() {
		System.out.println("Drawing circle");
		
	}
}

class Square extends Shape{

	@Override
	void draw() {
		System.out.println("Drawing square");
		
	}
	
}

public class Abstraction { 
	public static void main(String[] args) {
		Circle c= new Circle();
		c.draw();
		c.displayinfo();
		
		Square s = new Square();
		s.draw();
		Square s2 = new Square();
		s2.draw();
		
		
		c.displaytotalshapes();
	}

}
