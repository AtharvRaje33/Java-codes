class Box{
	private double l;
    private double w;
    private double h;

    public Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    public double getl() {
        return l;
    }

    public double getw() {
        return w;
    }

    public double geth() {
        return h;
    }
    
    public double getvol() {
    	return (l*w*h);
    }

}
public class Box_example {
	public static void main(String[] args) {
		Box b1 = new Box(2, 3, 1);
		System.out.println("Length:"+b1.getl());
		System.out.println("Length:"+b1.geth());
		System.out.println("Length:"+b1.getw());
		System.out.println("Volume:"+b1.getvol());

	}
	
	
}
