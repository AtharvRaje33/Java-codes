class Animal{
	String color;
	int age;
	
	public Animal(String color,int age) {
		this.color=color;
		this.age=age;
	}
	
	void display() {
		System.out.println("Color is:"+color+",age is:"+age);
	}
}
public class thisanimal {
	public static void main(String[] args) {
		Animal a1=new Animal("black", 12);
		a1.display();
	}
}
