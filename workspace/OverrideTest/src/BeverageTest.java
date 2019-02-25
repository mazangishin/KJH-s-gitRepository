
public class BeverageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coffee coffee = new Coffee();
		Beverage cider = new Beverage();
		
		cider.name = "사이다";
		cider.capacity = 100;
		cider.price = 1000;
		cider.info();
		System.out.println();
		
		coffee.name = "카페라떼";
		coffee.capacity = 300;
		coffee.price = 2000;
		coffee.caffeine = 10;
		coffee.info();
		
		
	}

}
