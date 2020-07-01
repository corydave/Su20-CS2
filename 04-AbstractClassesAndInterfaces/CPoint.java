

public class CPoint implements Comparable<CPoint>{

	public int x;
	public int y;
	
	public CPoint() {
		x = 0;
		y = 0;
	}
	
	public CPoint(int x, int y) {
		this.x = x;
		this.y = y;		
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	public int compareTo(CPoint point) {
		
		double myDistance = Math.pow((Math.pow(x, 2) - Math.pow(y, 2)), .5);
		double theirDistance = Math.pow((Math.pow(point.x, 2) - Math.pow(point.y, 2)), .5);
		
		return (int)(myDistance - theirDistance);
		
	}
	
}
