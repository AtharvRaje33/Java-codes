class Member{
	String name;
	int age;
	int pno;
	String address;
	double salary;
	
	void printSalary() {
		System.out.println("Salary is:"+salary);
	}
}
class Employee extends Member{
	String specialization;
	
	public Employee(String name,int age,int pno,String address,double salary,String specialization){
		this.address=address;
		this.name=name;
		this.age=age;
		this.pno=pno;
		this.salary=salary;
		this.specialization=specialization;
	}
	
	
}
class Manager extends Member{
	String department;
	public Manager(String name,int age,int pno,String address,double salary,String department){
		this.address=address;
		this.name=name;
		this.age=age;
		this.pno=pno;
		this.salary=salary;
		this.department=department;
	}
}
public class Inheritance {
	public static void main(String[] args) {
		Manager m1 = new Manager("Arun", 25, 1010101, "Pune", 25000, "Management");
		Employee e1 = new Employee("Dale", 22, 1019332, "Mumbai", 20000, "HR");
		
		m1.printSalary();
		e1.printSalary();
		
	}
}
