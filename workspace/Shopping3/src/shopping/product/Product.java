package shopping.product;

public class Product {

	private int price; // 제품의 가격
	private String name;

	public Product() {

	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getname() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public String toString() {
		return "Product";
	}

}
