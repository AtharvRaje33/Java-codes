public class StaticNestedClass {
    private static int outerStaticVariable = 5;
    private int outerInstanceVariable = 10;

    // Static nested class should be declared as static
    static class StaticNested {
        void display() {
            // Corrected to access outerStaticVariable
            System.out.println("Static nested class.\nouter static variable:" + outerStaticVariable);
        }
    }

    void useStaticNestedClass() {
        StaticNested sno = new StaticNested();
        sno.display();
    }

    public static void main(String[] args) {
        StaticNestedClass o1 = new StaticNestedClass();
        o1.useStaticNestedClass(); // Corrected method name
        StaticNestedClass.StaticNested directStaticNestedObject = new StaticNestedClass.StaticNested();
        directStaticNestedObject.display();
    }
}
