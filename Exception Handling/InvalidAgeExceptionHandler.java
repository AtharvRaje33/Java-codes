import java.util.Scanner;

class InvalidAgeException extends Exception {
	
	public InvalidAgeException(String message) {
		super(message);
	}

}


class InvalidAgeExceptionHandler {
	public static void main(String[] args) throws InvalidAgeException {
		System.out.println("Enter age:");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		try {
			checkAgeHandler(a);
		} catch (InvalidAgeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	static void checkAgeHandler(int a) throws InvalidAgeException{
		checkAge(a);
	}
	
	
	
	static void checkAge(int a) throws InvalidAgeException {
		if(a<18) {
			throw new InvalidAgeException("Less than 18");
		} else {
			System.out.println("Welcome");
		}
	}
}
