
public class Point3DTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point3D p3 = new Point3D();
		String locationStr = "";
		
		p3.x = 1;
		p3.y = 2;
		p3.z = 3;
		
		locationStr = p3.getlocation();
				
		System.out.println(locationStr);
		
		
		
		Point p = new Point();
		
		p.x = 10;
		p.y = 20;
		
		locationStr = p.getlocation();
		
		System.out.println(locationStr);
		
		
		
	}

}
