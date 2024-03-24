// interface is same as abstraction but it can have multiple inheritance
// methods wont have body
// instead of extends keyword, implement keyword will be used
// it cannot be instantiated
// name of interface should be an adjective (good practice)

interface Switchable{
	void turnon();
	void turnoff();
}

class Fan implements Switchable{

	@Override
	public void turnon() {
		System.out.println("Fan is on");
		
	}

	@Override
	public void turnoff() {
		System.out.println("Fan is off");
	
}
	
}

class Ttv implements Switchable{

	@Override
	public void turnon() {
		System.out.println("Tv is on");
		
	}

	@Override
	public void turnoff() {
		System.out.println("Tv is off");
		
	}
	
}
	

public class Interface {
	public static void main(String[] args) {
		Fan f = new Fan();
		f.turnon();
		
		Switchable tv1 = new Ttv();
		tv1.turnon();
		Switchable f1 = new Fan();
		f1.turnoff();
	}
}
