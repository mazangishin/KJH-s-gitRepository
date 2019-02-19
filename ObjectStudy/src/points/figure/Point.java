package points.figure;

public class Point {

	int x;
	int y;
	
	public Point() {
		
	}
	
	public Point (int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}
	
	String getLocation() {
		
		return "x:" + x + ", y:" + y;
	}
	
}
