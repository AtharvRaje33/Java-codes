class Student{
	int rollno;
	String name;
	
	public Student() {
		System.out.println("no args constructor");		
	}
	
	public Student(int rollno) {
		this.rollno=rollno;
	}
	
	public Student(int rollno,String name) {
		this();
		
		
		this.rollno=rollno;    //use 1
		this.name=name;
	}
	
	void display() {
		System.out.println("Rollno: "+rollno);
		System.out.println("Name: "+name);
	}
	
	void tpdisplay() {
		this.display();       //use 2
	}
	
	
	
}



public class Useofthiskeyword {
	public static void main(String[] args) {
		Student s1=new Student(10, "Jude");
		s1.tpdisplay();
	}
	
}
