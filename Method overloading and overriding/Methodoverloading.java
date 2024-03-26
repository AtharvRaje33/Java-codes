

public class Methodoverloading {
	int add(int a,int b) {
		return (a+b);
	}
	
	double add(double a,double b) {
		return (a+b);
	}
	
	int add(int a,int b,int c) {
		return a+b+c;
	}
	
	String add(String a,String b) {
		return (a+b);
	}
	
	String add(int a,String b) {
		return (a+b);
	}
	
	String add(String b,int a) {
		return (b+a);
	}
	
	String add(String a,String b,String c) {
		return(a+b+c);
	}
	
	public static void main(String[] args) {
		Methodoverloading m1 = new Methodoverloading();
		System.out.println(m1.add(2, 3));
		System.out.println(m1.add("hi", "hello"));
		System.out.println(m1.add("hi", "hello","ssup"));
		System.out.println(m1.add("hi", 5));
		System.out.println(m1.add(5,"hi"));
		System.out.println(m1.add(5.1,1.5));
		
		
		
	}
	
}
