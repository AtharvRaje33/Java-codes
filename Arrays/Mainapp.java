


public class Mainapp {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.id=162;
		s1.name="Atharv";
		s1.grade='O';
		
		Studentdatabase csb = new Studentdatabase();
		csb.addstudent(12, "Rutu", 'O');
		csb.addstudent(162, "Atharv", 'O');
		
		csb.displaystudent();
		
		csb.removestudent(s1);
	}
}
