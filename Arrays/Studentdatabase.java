import java.util.ArrayList;


public class Studentdatabase {
	ArrayList<Student> list = new ArrayList<Student>();
	
	void addstudent(int id1,String name1,char grade1) {
			Student s = new Student();
			s.id=id1;
			s.name=name1;
			s.grade=grade1;
			list.add(s);
	}
	
	
	void removestudent(Student s) {
		list.remove(s);
	}
	
	void displaystudent() {
		for(Student s : list) {
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.grade);
		}
	}
}
