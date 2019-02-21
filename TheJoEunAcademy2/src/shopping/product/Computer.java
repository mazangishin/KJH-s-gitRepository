package shopping.product;

public class Computer extends Product {

	public String name = "";
	
	public Computer() {
		
		super("조은 Computer", 400);
		this.name = "조은 Computer";
	}
	
	public Computer(String productName, int price) {

		super(productName, price);

	}
}