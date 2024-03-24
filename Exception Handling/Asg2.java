import java.util.Scanner;

public class Asg2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		String snum = s.nextLine();
		
		try {
			int n = Integer.parseInt(snum);
			System.out.println("Number is:"+n);
		} catch (NumberFormatException e) {
			System.out.println("Wrong format input");
		}
	}
}
