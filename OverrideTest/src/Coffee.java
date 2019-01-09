
public class Coffee extends Beverage{

	
	int caffeine = 0;
	
	
	void info () {
		System.out.println("커피 이름: " + name);
		System.out.println("용량 " + capacity + "ml");
		System.out.println("가격 " + price);
		System.out.println("카페인 " + caffeine + "%");
	}
	
	
	
}
