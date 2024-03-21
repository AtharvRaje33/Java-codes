
public class LocalInnerClass {
	void outermethod1() {
		final int outerFinalVariable = 10;
		
		class LocalInner{
			void display() {
				System.out.println("LocalInner class method.\nouter variable:"+outerFinalVariable);
			}
		}
		
		LocalInner localinner = new LocalInner();
		localinner.display();
	}
	
	public static void main(String[] args) {
		LocalInnerClass outerobj = new LocalInnerClass();
		outerobj.outermethod1();
	}
}
