import java.util.Scanner;

public class CapitalizeFirst {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sentence = sc.nextLine();
		
		String[] words = sentence.split(" ");
		for(int i=0;i<words.length;i++) {
		         String firstLetter = words[i].substring(0, 1);
		         String restOfWord = words[i].substring(1);
		         firstLetter = firstLetter.toUpperCase();
		         words[i] = firstLetter + restOfWord; 
		}
		
		String f = String.join(" ",words);
		System.out.println("Capitalised sentence:");
		System.out.println(f);
		
	}
}
