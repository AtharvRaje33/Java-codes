import java.util.Scanner;

public class WordOccurance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sentence = sc.nextLine();
		System.out.println("Enter word to be searched:");
		String word = sc.nextLine();
		int count=0;

	
		
		String[] words=sentence.split(" ");
		for(String w:words) {
			if(word.equals(w.toString())){
				count++;
			}
		}
		
		System.out.println("Occurances:"+count);
	}
}
