
public class Largest_number {
	public static void main(String[] args) {

		int largestNumber = Integer.parseInt(args[0]);

		for (String arg : args) {
		int currentNumber = Integer.parseInt(arg);
		if (currentNumber > largestNumber) {
		largestNumber = currentNumber;
		}
		}
		System.out.println("Largest number is:"+largestNumber);
		}
}
