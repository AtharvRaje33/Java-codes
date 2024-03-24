interface Movable{
	void moveup();
	void movedown();
	void moveleft();
	void moveright();
}

class Movablepoint implements Movable{
	int x,y,xspeed,yspeed;
	
	
	

	public Movablepoint(int x, int y, int xspeed, int yspeed) {
		super();
		this.x = x;
		this.y = y;
		this.xspeed = xspeed;
		this.yspeed = yspeed;
	}
	
	

	@Override
	public String toString() {
		return "Movablepoint [x=" + x + ", y=" + y ;
	}



	@Override
	public void moveup() {
		// TODO Auto-generated method stub
		y+=yspeed;
		
	}

	@Override
	public void movedown() {
		// TODO Auto-generated method stub
		y-=yspeed;
		
	}

	@Override
	public void moveleft() {
		// TODO Auto-generated method stub
		x+=xspeed;
		
	}

	@Override
	public void moveright() {
		// TODO Auto-generated method stub
		x-=xspeed;
		
	}
	
}

class MovableCircle implements Movable{
	int radius;
	Movablepoint center;
	
	

	public MovableCircle(int x,int y, int xspeed, int yspeed,int radius) {
		center = new Movablepoint(x, y, xspeed, yspeed);
		this.radius=radius;
	}

	



	@Override
	public void moveup() {
		// TODO Auto-generated method stub
		center.y+=center.yspeed;
		
	}

	@Override
	public String toString() {
		return "MovableCircle [radius=" + radius + ", center=" + center + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}



	@Override
	public void movedown() {
		// TODO Auto-generated method stub
		center.y-=center.yspeed;
		
	}

	@Override
	public void moveleft() {
		// TODO Auto-generated method stub
		center.x+=center.xspeed;
		
	}

	@Override
	public void moveright() {
		// TODO Auto-generated method stub
		center.x-=center.xspeed;
		
	}
	
	
}

public class Movableexample {
	public static void main(String[] args) {
		Movable m1 = new Movablepoint(5, 6, 10, 15);
	    System.out.println(m1);
	    m1.moveleft();
	    System.out.println(m1);
	    Movable m2 = new MovableCircle(2, 1, 2, 3, 20);
	    System.out.println(m2);
	    m2.moveleft();
	    System.out.println(m2);
	    
	}

}
