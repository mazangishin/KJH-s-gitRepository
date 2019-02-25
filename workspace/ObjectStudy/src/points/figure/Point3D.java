package points.figure;

import points.figure.Point;

public class Point3D extends Point{

	int z;
	
	public Point3D() {
		
	}
	
	public Point3D(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		
	}
	
	String getLocation() {
		
		return "x:" + x + ", y:" + y;
	}
	
}
