
public class PersonClass {
	int age;
	String name;
	
	
	
	public static void main(String[] args) {
		PersonClass p1 = new PersonClass();
		PersonClass p2 = new PersonClass();
		PersonClass p3 = new PersonClass();
		
		p1.age=19;
		p1.name="Messi";
		
		p2.age=44;
		p2.name="Bob";
		
		p3.age=76;
		p3.name="Klopp";
		
		System.out.println("Person 1 details:\n"+p1.age+"\n"+p1.name);
		System.out.println("Person 2 details:\n"+p2.age+"\n"+p2.name);
		System.out.println("Person 3 details:\n"+p3.age+"\n"+p3.name);
	}
}


