
public class StudentManagement {
	int no_of_students;
	String teacher;
	String course;
	
	public static void main(String []args)
	{
		StudentManagement s=new StudentManagement();
		
		s.no_of_students=76;
		s.teacher="Dr. Pandey";
		s.course="Physics";
		
		System.out.println(s.teacher);
		System.out.println(s.course);
		System.out.println(s.no_of_students);
	}
}
