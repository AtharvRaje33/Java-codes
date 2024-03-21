
public class NonStaticInnerClass {
	private int outervariable = 10;
	
	public int getoutervariable() {
		return outervariable;
	}
	
	class Inner1{                                //inner1 is inner class of nonstaticinnerclass
		public void Display() {
			System.out.println("Inner class method. Outer variable:"+outervariable);
		}
	}                                     
	
	
	public static void main(String[] args) {
		NonStaticInnerClass o1 = new NonStaticInnerClass();
		
		System.out.println("Value of outer variable is:"+o1.getoutervariable());
		NonStaticInnerClass.Inner1 i1 = o1.new Inner1();                               // declaration of inner class object 
		
		i1.Display();
		
		
	}
}


class D3{}                // This is not an inner class 

