
public class Overridetostring {
	    private int id;
	    private String name;

	    public Overridetostring(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    @Override
	    public String toString() {
	        return "this class{" + id + ", '" + name + "'}";
	    }

	    public static void main(String[] args) {
	       Overridetostring obj = new Overridetostring(1, "Example");
	        System.out.println(obj);
	    }
	}


