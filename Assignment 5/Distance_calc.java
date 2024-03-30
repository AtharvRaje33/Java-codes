
public class Distance_calc {
	
	public double dist(double dkm) {
		return dkm*1000;
	}
	
	public double dist(double dm,boolean km) {
		return km? dm/1000 : dm;
	}
	
	public double dist(int x1,int x2,int y1,int y2) {
		int dx=x2-x1;
		int dy=y2-y1;
		return Math.sqrt(dx*dx+dy*dy);
	}
	
	public static void main(String[] args) {
		
		Distance_calc dc = new Distance_calc();
		System.out.println("Distance in metres:"+ dc.dist(5));
		System.out.println("Distance from coordinates:"+ dc.dist(5,10,2,4));
		System.out.println("Distance in kilometres:"+ dc.dist(5000,true));
		
	}
}
