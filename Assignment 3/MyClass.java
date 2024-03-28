
public class MyClass {
	
	public MyClass() {
		System.out.println("This is a default constructor");
		}
		
		public MyClass(int a) {
			System.out.println("This is a parameterised constructor. Value is:"+a);
			}

			public MyClass(MyClass obj) {
			System.out.println("This is a parameterised constructor");
			}
			
				public static void main(String[] args) {
					MyClass o1 = new MyClass(12);
					MyClass o2 = new MyClass(o1);
			}
}
