import java.util.Scanner;

public class Currency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of money:");
		int value = sc.nextInt();
		
		String notation="$";
		String svalue = Integer.toString(value);
		
		String f = notation+svalue;
		
		System.out.println("Amount with currency is:");
		System.out.println(f);
		
	}
}
