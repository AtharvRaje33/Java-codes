import java.util.Scanner;

class Tempcheck extends Exception{
	public Tempcheck(String message) {
		super(message);
	}
}

public class TemperatureExceptionHandler {
	public static void main(String[] args) throws InvalidAgeException {
		System.out.println("Enter temperature in celcius:");
		Scanner s = new Scanner(System.in);
		int temp = s.nextInt();
		
		try {
			checktemphandler(temp);
		} catch (Tempcheck e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	static void checktemphandler(int a) throws Tempcheck{
		convert(a);
	}
	
	static void convert(int temp) throws Tempcheck {
		if(temp<0) {
			throw new Tempcheck("Invalid temperature value");
		} else {
			double f = ((9*temp/5)+32);
			System.out.println("Temperature in farhaneit is:"+f);
		}
	}
}
