public class Outerclass {
    private int b;

    public Outerclass(int b) {
        this.b = b;
    }

    public void outer() {
        System.out.println("Outer method. Outer variable value: " + b);
    }

    class Innerclass {
        private int a;

        public Innerclass(int a) {
            this.a = a;
        }

        public void inner() {
            System.out.println("Inner method. Inner variable value: " + a);
        }
    }

    public static void main(String[] args) {
        Outerclass outerObj = new Outerclass(5);
        outerObj.outer();
        Innerclass innerObj = outerObj.new Innerclass(10);
        innerObj.inner();
    }
}
