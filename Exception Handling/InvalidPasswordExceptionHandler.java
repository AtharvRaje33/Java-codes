import java.util.Scanner;

class PasswordValidator extends Exception{
	public PasswordValidator(String message) {
		super(message);
	}
}

public class InvalidPasswordExceptionHandler {
	public static void main(String[] args) {
		System.out.println("Enter password:");
		Scanner s = new Scanner(System.in);
		String pass = s.nextLine();
		
		try {
			validatepasshandler(pass);
		} catch (PasswordValidator e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	static void validatepasshandler(String pass) throws PasswordValidator{
		validatepass(pass);
	}
	
	
	static void validatepass(String pass) throws PasswordValidator {
		if(pass.length()<8) {
			throw new PasswordValidator("Password should be longer");
		} else {
			System.out.println("Valid password");
		}
	}
}
