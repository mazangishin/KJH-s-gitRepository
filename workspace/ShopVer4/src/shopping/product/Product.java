package shopping.product;

public class Product {

	private int price; // 제품의 가격
	private int bonusPoint; // 제품구매 시 제공하는 보너스 점수

	public Product() {
		
	}

	Product(int price) {

		this.price = price;
		this.bonusPoint = (int) (price / 10.0); // 보너스 점수는 제품가격의 10%

	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	@Override
	public String toString() {
		return "Product [price=" + price + ", bonusPoint=" + bonusPoint + "]";
	}

}
