package shopping.products.tv;

public class Tv {
	
	public String name = "";
	public int price = 0;

	public Tv () {
		
	}
	
	public Tv (String name, int price) {
		
		this.name = name;
		this.price = price;
		
	}
	
	public void myInfoView () {
		
		System.out.println("tv명 : " + name);
		System.out.println("tv 가격: " + price);
		
	}
	
	
}
