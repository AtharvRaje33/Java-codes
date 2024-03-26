
public class Shape {
	double area(int side) {
		return (side*side);
	}
	
	double area(double base,double height) {
		return (0.5*base*height);
	}
	
	double area(double r) {
		return(3.14*r*r);
	}
	
	
	
	public static void main(String[] args) {
		Shape s1 = new Shape();
		System.out.println("circle: "+s1.area(2.5));
		System.out.println("Square: "+s1.area(2));
		System.out.println("triangle: "+s1.area(2,12));
	}
}
