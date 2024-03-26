import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter a string:");
		String s = sc.nextLine();
		s.toLowerCase();
		
		StringBuilder rs = new StringBuilder();
		rs.append(s);
		
		rs.reverse();

		
		if(s.equals(rs.toString())) {
			System.out.println("String is a palindrome");
		}
		else {
			System.out.println("String is not a palindrome");
		}
	}
}
