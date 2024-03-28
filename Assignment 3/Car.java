public class Car {
	String color;
	int engine_number;
	
	public Car(String color,int engine_number) {
		this.color=color;
		this.engine_number=engine_number;
		
	}
	
	public Car() {
		
	}
	
	
	public static void main(String[] args) {
		Car c1=new Car("red",2124);
		System.out.println("Color is "+ c1.color+",engine number is "+c1.engine_number);
		
		Car c2=new Car();
		c2.engine_number=2232;
		c2.color="black";
		System.out.println("Color is "+ c2.color+",engine number is "+c2.engine_number);
		
	}
}
