import java.util.HashSet;
import java.util.Scanner;

public class HashSetAssignment {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Enter a string:");
		String word=s.nextLine();
		HashSet<Character> uniqueChar = new HashSet<>();
		
		for(int i=0;i<word.length();i++) {
			uniqueChar.add(word.charAt(i));
		}
		
		System.out.println("HashSet after adding elements: " + uniqueChar);
		
	}
}
