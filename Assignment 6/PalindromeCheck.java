import java.util.Scanner;

public class PalindromeCheck {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=s.nextInt();
		int onum=num;
		int rnum=0;
		
		while(onum!=0) {
			int digit=onum%10;
			rnum=rnum*10+digit;
			onum=onum/10;
		}
		
		
		if(rnum==num) {
			System.out.println("Number is a palindrome");
		}
		else {
			System.out.println("Number is not a palindrome");
		}
	}
}
