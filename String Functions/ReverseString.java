import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		String s = sc.nextLine();
		
		StringBuilder rs = new StringBuilder();
		
		rs.append(s);
		
		rs.reverse();
		
		System.out.println(rs);
		
	}
}
