package shopping.product;

public class Product {

	public int price = 0; // 제품의 가격
	public String name = "";
	
	Product (int price) {
		
		this.price = price;
		
	}
	
	Product (String name, int price) {
		this.name = name;
		this.price = price;
		
	}
}
