package shopping.product;

public class Book extends Product {

	public String name = "";
	
	public Book() {
		
		super("자바의 정석", 400);
		this.name = "조은 Computer";
	}
	
	public Book(String productName, int price) {

		super(productName, price);

	}
}