package ssss;

public class Apple {

	String color = "";
	String name = "";
	
	public Apple () {
		
	}
	
	public Apple (String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public void showAppleInfo () {
		System.out.println("사과의 이름은: " + name);
		System.out.println("사과의 색깔은: " + color);
	}
}
