public class Number_objects {
	
    private static int objectCount = 0;

    
    public Number_objects() {
        
        objectCount++;
    }

    public static int noo() {
        return objectCount;
    }

    
    public static void main(String[] args) {
        
        Number_objects o1 = new Number_objects();
        Number_objects o2 = new Number_objects();
        Number_objects o3 = new Number_objects();

        
        System.out.println("Number of objects created: " + Number_objects.noo());
    }
}
