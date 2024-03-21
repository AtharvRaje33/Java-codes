// concerned with conversion of data types
public class WrapperExample {
	public static void main(String[] args) {
		int a = 20;
		char n='a';
		Integer i = Integer.valueOf(a);     // converting primitive data type to explicit data type using wrapper class
		char n2 = Character.valueOf(n);
		System.out.println("i without autoboxing:"+i);
		
		Integer j = a;    // autoboxing
		
		System.out.println("j with autoboxing:"+j);
		
		
		int x = j.intValue();
		int x1 = j;   // autounboxing
		System.out.println("x1 after autounboxing:"+x1);
		
		 
		float f2 = j;     // autounboxing   
		System.out.println("f2 after autounboxing:"+f2);
		
		double l1 = j;  // autounboxing
		System.out.println("l1 after autounboxing:"+l1);
		
		char n1 = n2;
		System.out.println("n2 after autounboxing:"+n1);
		
		
	}
}
