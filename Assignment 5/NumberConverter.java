public class NumberConverter {
	
	Integer strtoint(char a) {
		int i=Integer.valueOf(a);
		return i;
	}
	
	String inttostr(int b) {
		String a= String.valueOf(b);
		return a;
	}
	
	public static void main(String[] args) {
		NumberConverter o1 = new NumberConverter();
		System.out.println("String to integer is:" + o1.strtoint('a'));
		System.out.println("Double to string is:" + o1.inttostr(3));
	}
}
