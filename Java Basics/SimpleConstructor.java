
public class SimpleConstructor {
	
	int a;
	
	public SimpleConstructor() {
		System.out.println("Default Constructor called");
		a=10;
	}
	
	public SimpleConstructor(int a) {     
		System.out.println("Parameterised Constructor called");
		this.a=a;
	}
	
	public static void main(String[] args) {
		SimpleConstructor s1 = new SimpleConstructor();
		System.out.println(s1.a);
		SimpleConstructor s2 = new SimpleConstructor(20);
		System.out.println(s2.a);
	}
}
