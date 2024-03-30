import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string:");
		String og = s.nextLine();
		
		int left=0;
		int right = og.length()-1;
		int c=1;
		
		while(left<right) {
			if(og.charAt(left)!=og.charAt(right)) {
				c=0;
				break;
			}
			else {
				left++;
				right--;
			}
		}
		if(c==1) {
			System.out.println("String is a palindrome");
		}
		else {
			System.out.println("String is not a palindrome");
		}
	}
}
