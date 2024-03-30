class SwapFunctions {

	int num;
	public SwapFunctions() {
		num = 0;
	}
	
	public SwapFunctions(int num) {
		this.num = num;
	}

	public static void swapByValue(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	
	public static void swapByReference(SwapFunctions obj1, SwapFunctions obj2) {
		int temp = obj1.num;
		obj1.num = obj2.num;
		obj2.num = temp;
	}
}

public class SwapByValue {

	public static void main(String[] args) {

		int a = 5;
		int b = 10;
		
		SwapFunctions sf1 = new SwapFunctions(20);
		SwapFunctions sf2 = new SwapFunctions(100);
		
		System.out.println("SWAP BY VALUE : ");
		System.out.println("Value of a before swap = " + a);
		System.out.println("Value of b before swap = " + b);
		
		SwapFunctions.swapByValue(a, b);
		
		System.out.println("Value of a after swap = " + a);
		System.out.println("Value of b after swap = " + b);
		
		System.out.println("\nSWAP BY REFERENCE : ");
		System.out.println("Value of num in sf1 before swap = " + sf1.num);
		System.out.println("Value of num in sf2 before swap = " + sf2.num);
		
		SwapFunctions.swapByReference(sf1, sf2);
		
		System.out.println("Value of num in sf1 after swap = " + sf1.num);
		System.out.println("Value of num in sf2 after swap = " + sf2.num);
	}
}
