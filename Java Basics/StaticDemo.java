class StaticDemon{
	static int count=12;
	int a=10;
	
	static int getcount() {
		return count;
	}
	
	public StaticDemon(int count) {
		count++;
		this.count=count;
	}
}


public class StaticDemo {
	
	
	
	public static void main(String[] args) {
		StaticDemon s1=new StaticDemon(10);
		System.out.println(StaticDemon.getcount());
		
		StaticDemon s2=new StaticDemon(15);
		System.out.println(StaticDemon.getcount());
		
		
		StaticDemon s3=new StaticDemon(20);
		System.out.println(StaticDemon.getcount());
		
		
		StaticDemon s4=new StaticDemon(25);
		System.out.println(StaticDemon.getcount());
		
	}
}



// object is not required to call static objects as static variables are universal
// static variables are created only once and used everywhere ,,,, global variable copies are created for every object
