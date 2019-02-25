
public class Car2 {

	String color = "";
	String gearType = "";
	int door = 0;
	
	public Car2() {
	
	}
	
	Car2 (String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;		
	}
	
	void setDoor(int door) {
		this.door = door;
		
	}
	
	
	void carInfo() {
		System.out.println("색상: " + color);
		System.out.println("기어타입: " + gearType);
		System.out.println("문 개수: " + door);
	}
	
}
