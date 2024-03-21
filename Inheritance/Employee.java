
public class Employee {
	int empid;
	String name;
	
	Address address;
	
	public Employee(int empid,String name,Address address) {
		this.empid=empid;
		this.name=name;
		this.address=address;
	}
	
	public static void main(String[] args) {
		Address address=new Address();
	}
}


