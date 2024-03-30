class pparent {
	
    pparent() {
        System.out.println("Parent's default constructor");
    }
    pparent(int value) {
        System.out.println("Parent's parameterized constructor with value: " + value);
    }
}

class child extends pparent {
    child() {
        super();
        System.out.println("Child's default constructor");
    }
    child(int value) {
        super(value);
        System.out.println("Child's parameterized constructor with value: " + value);
    }
}

public class ParentConstructor {
    public static void main(String[] args) {
        child childDefault = new child();
        child childParameterized = new child(42);
    }
}

