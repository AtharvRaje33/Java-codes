// 2 types - 
// 1) checked exceptions - compile time exceptions
// 2) unchecked exceptions - runtime exceptions
// nested try catch is possible but discourage

public class ExceptionHandling {
	public static void main(String[] args) {
		int []arr = new int[2];
		arr[0]=1;
		arr[1]=2;
		
		try {
		System.out.println(arr[3]);
		
		int i=12;
		int c=i/0;
		
		}catch (ArithmeticException e) {                               // can have multiple catch blocks
			System.out.println("Arithmetic exception");
		}catch (ArrayIndexOutOfBoundsException e) {
			//e.printStackTrace();                  // prints line of exception
			System.out.println(e);
			System.out.println("Exception occurred");
		}finally {
			System.out.println("Finally block");
		}
		System.out.println(arr[1]);
		System.out.println(arr[0]);
	}
}
