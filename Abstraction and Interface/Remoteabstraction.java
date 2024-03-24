abstract class Remote{
	static int noofobjects=0;
	abstract void switchon();
	abstract void switchoff();
	
	Remote(){
		noofobjects++;
	}
	
	void noofremotes() {
		System.out.println("number of remotes:"+noofobjects);
	}
	
}

class Tv extends Remote{

	@Override
	void switchon() {
		System.out.println("Tv on");
		
	}

	@Override
	void switchoff() {
		System.out.println("Tv off");
		
	}
	
	void changechannel(int num) {
		System.out.println("Channel number changed to "+num);
	}
	
}

class Ac extends Remote{

	@Override
	void switchon() {
		System.out.println("Ac on");
		
	}

	@Override
	void switchoff() {
		System.out.println("Ac off");
		
	}
	
	void changetemp(int temp) {
		System.out.println("Temperature changed to "+temp);
	}
	
}

public class Remoteabstraction {
	public static void main(String[] args) {
		Ac c1 = new Ac();
		c1.switchon();
		c1.changetemp(12);
		c1.switchoff();
		
		Tv t1 = new Tv();
		t1.switchon();
		t1.changechannel(121);
		t1.switchoff();
		
		t1.noofremotes();
	}
	

}
