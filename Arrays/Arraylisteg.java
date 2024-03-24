import java.util.ArrayList;
import java.util.Vector;

public class Arraylisteg {
	public static void main(String[] args) {
		ArrayList<String> listofwords = new ArrayList<String>();
		
		System.out.println(listofwords.size());
		
		listofwords.add("Hello");
		listofwords.add("Apple");
		listofwords.add("mango");
		listofwords.add("peach");
		
		listofwords.add(2,",");
		System.out.println(listofwords.get(2));
		listofwords.remove(2);
		
		
		System.out.println(listofwords.size());
		
		for(String word : listofwords) {
			System.out.println(word);
		}
		
			
		
		Vector<Integer> low = new Vector<Integer>();
			System.out.println(low.size());
			
			low.add(1);
			low.add(2);
			low.add(3);
			
			low.add(3,4);
			
			low.add(5);
			
			
			
			for(Integer i : low) {
				System.out.println(i);
			}
			
		
		
	}
}
