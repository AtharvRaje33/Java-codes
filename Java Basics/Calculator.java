
public class Calculator {
	private int num1;
	private int num2;
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int addition(int num1,int num2) {
		return num1+num2;
	}
	
	public int subtraction(int num1,int num2) {
		return num1-num2;
	}
	
	public int mul(int num1, int num2) {
		return num1*num2;
	}
	
	public float div(int num1,int num2) {
		return num1/num2;
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println("Setting values of numbers");
		cal.setNum1(10);
		cal.setNum2(5);
		System.out.println("Number 1 is:" +cal.getNum1());
		System.out.println("Number 2 is:"+cal.getNum2());
		System.out.println("Performing operations:");
		System.out.println("Addition is:" + cal.addition(cal.num1, cal.num2));
		System.out.println("Subtraction is:" + cal.subtraction(cal.num1, cal.num2));
		System.out.println("Multiplication is:" + cal.mul(cal.num1,cal.num2));
		System.out.println("Division is:" + cal.div(cal.num1, cal.num2));
		
	}
}
