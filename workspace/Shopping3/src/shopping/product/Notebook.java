package shopping.product;

public class Notebook extends Product {

	private int price = 0;
	private String name = "";

	public Notebook() {

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
		return "Notebook";
	}

}