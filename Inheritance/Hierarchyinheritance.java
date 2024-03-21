class Student{
	int batch;
	String col="SIT";
}

class Sy extends Student{
	String subject="Java";
	
	void displaysy(int batch) {
		System.out.println("Subject is:"+subject+" Batch is:"+batch+" College is:"+col);
	}
	
}

class Ty extends Student{
	String subject="Webdev";
	
	
	void displayty(int batch) {
		System.out.println("Subject is:"+subject+" Batch is:"+batch+" College is:"+col);
	}
}



public class Hierarchyinheritance {
	public static void main(String[] args) {
		Sy s1 = new Sy();
		s1.displaysy(26);
		
		Ty t1 = new Ty();
		t1.displayty(25);
	}

}
