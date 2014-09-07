package Point;

public class Point {

	private int p1;
	private int p2;
	
	public static void main(String[] args ){
		Point p1 = new Point();
		Point p2 = new Point(3,4);
				
		System.out.println(p1.toString());   // ==> (0,0)
		System.out.println(p2.toString());   // ==> (3,4)
				
		if (p1.isEqualTo(p2)){              // False!
			System.out.println("The two points are equal");
		}
				
		double dist = p1.distanceTo(p2);
		System.out.println("Point Distance: "+dist);
				
		p2.move(5,-2);         // ==> (8,2)
		p1.moveToXY(8,2);      // ==> (8,2)
				
		if (p1.isEqualTo(p2)){              // True!
			System.out.println("The two points are equal");
		}
	}
	
	public Point(){
		this(0,0);
	}
	
	public Point(int p1, int p2){
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public String toString(){
		return " ==> (" + p1 + "," + p2 + ")";
	}
	
	public boolean isEqualTo(Point p){
		if(this.p1 == p.p1 && this.p2 == p.p2){
			return true;
		}
		else{
			return false;
		}
	}
	
	public double distanceTo(Point p){
		return Math.sqrt(  Math.pow((p.p1 - this.p1),2) + Math.pow((p.p2 - this.p2),2)  );
	}
	
	public void move(int d1, int d2){
		this.p1 += d1;
		this.p2 += d2;
	}
	
	public void moveToXY(int p1, int p2){
		this.p1 = p1;
		this.p2 = p2;
	}
	
}
