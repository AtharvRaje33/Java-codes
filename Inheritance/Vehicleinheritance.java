class Vehicle{
	int wheels=2;
	String color="Red";
	String brand="Honda";
	
	void describeparent() {
		System.out.println("Vehicle Wheels are "+wheels+" and color is "+color);
	}
	
	
}

class Car extends Vehicle{
	int car_wheels = 4;
	String car_color="Black";
	int cspeed=120;
	
	void describechild() {
		System.out.println("Car Wheels are "+car_wheels+" and color is "+car_color+"\nSpeed is:"+cspeed);
	}
}

class Sportscar extends Car{
	int scar_wheels = 4;
	String scar_color="White";
	int scspeed=400;
	
	void describesc() {
		//System.out.println("Vehicle Wheels are:"+wheels+"and color is "+color+"brand is:"+brand);
		//System.out.println("Car Wheels are:"+car_wheels+"and color is "+car_color+"Brand is:"+car_brand);
		System.out.println("Sports car wheels are "+scar_wheels+" and color is"+scar_color+"\nSpeed is:"+scspeed);
	}
}




public class Vehicleinheritance {
	public static void main(String[] args) {
		Sportscar c1 = new Sportscar();
		c1.describeparent();
		c1.describechild();
		c1.describesc();
	}
}
