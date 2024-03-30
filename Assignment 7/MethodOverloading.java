class MathOperations {
   
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading {
	public static void main(String[] args) {
		MathOperations m = new MathOperations();
		m.add(2, 2);
		m.add(12.2, 21.1);
	}
}
