
public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String color = "";
		String geartype = "";
		int door = 0;
		
		color = "white";
		geartype = "auto";
		door = 4;
		
		Car car = new Car("white", "auto", 4);
						
		
		
		System.out.println("자동차 특징");
		System.out.println("색상은 " + car.color);
		System.out.println("변속기 종류는 " + car.geartype);
		System.out.println("문의 개수는 " + car.door);
		System.out.println("인 자동차를 만들었습니다");
		
	}

}
