public class Static_block {
    
    static int staticVariable;

    
    static {
        System.out.println("This is a static block.");
        staticVariable = 42;
        
    }

   
    public static void main(String[] args) {
        System.out.println("Static variable value: " + staticVariable);
        
    }
}

