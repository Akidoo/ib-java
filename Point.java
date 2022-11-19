
public class Point {
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public static Point genRandomPoint() {
		int x = (int)(Math.random()*10);
		int y = (int)(Math.random()*10);
		return new Point(x, y);
	}
	
	public Point minus(Point other) {
		int xDist = this.x - other.x;
		int yDist = this.y - other.y;
		return new Point(xDist, yDist);
	}
	
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
	
	public static void main(String[] args) {
		Point p1 = new Point(5, 6);
		Point p2 = new Point(15, 7);
		
		Point distance = p2.minus(p1);
		
		Point randomPoint = Point.genRandomPoint();
		System.out.println(randomPoint);
	}
}

