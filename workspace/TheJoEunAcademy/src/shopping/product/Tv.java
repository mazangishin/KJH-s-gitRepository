package shopping.product;

public class Tv extends Product {

	public String name = "";
	
	public Tv() {
		
		super("조은 Tv", 100);
		this.name = "조은 Tv";
	}
	
	public Tv(String productName, int price) {

		super(productName, price);

	}
}
