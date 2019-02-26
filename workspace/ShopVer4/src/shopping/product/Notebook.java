package shopping.product;

public class Notebook extends Product {

	public Notebook() {

		super(300);

	}

	@Override
	public String toString() {
		return "Notebook [getPrice()=" + getPrice() + ", getBonusPoint()=" + getBonusPoint() + "]";
	}

	
}