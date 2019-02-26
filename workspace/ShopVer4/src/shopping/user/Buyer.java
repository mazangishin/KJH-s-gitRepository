package shopping.user;

import java.util.Arrays;

import shopping.product.*;

public class Buyer {

	private String name = "";
	private int money = 1000;
	private int bonusPoint = 0;

	public Product[] itemArr = new Product[10];
	public int cnt = 0;

	public Buyer() {

	}

	public Buyer(String name, int money) {
		super();
		this.setName(name);
		this.money = money;
	}

	public void buy(Tv product) {
		if (money < product.getPrice()) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money = money - product.getPrice(); // 가진 돈에서 구입한 제품의 가격을 뺀다
		bonusPoint = bonusPoint + product.getBonusPoint(); // 제품의 보너스 점수를 추가한다.
		itemArr[cnt++] = product;
		System.out.println(product + "를 구입하셨습니다.");
	}

	public void buy(Computer product) {
		if (money < product.getPrice()) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money = money - product.getPrice(); // 가진 돈에서 구입한 제품의 가격을 뺀다
		bonusPoint = bonusPoint + product.getBonusPoint(); // 제품의 보너스 점수를 추가한다.
		itemArr[cnt++] = product;
		System.out.println(product + "를 구입하셨습니다.");
	}

	public void buy(Notebook product) {
		if (money < product.getPrice()) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money = money - product.getPrice(); // 가진 돈에서 구입한 제품의 가격을 뺀다
		bonusPoint = bonusPoint + product.getBonusPoint(); // 제품의 보너스 점수를 추가한다.
		itemArr[cnt++] = product;
		System.out.println(product + "를 구입하셨습니다.");
	}

	public void showInfo() {
		int sum = 0;
		String itemListStr = "";

		System.out.println("[" + getName() + "]님의 물품 구매 내역");

		for (int i = 0; i < itemArr.length; i++) {
			if (itemArr[i] == null) {
				break;
			}
			sum = sum + itemArr[i].getPrice();
			itemListStr = itemListStr + itemArr[i] + ", ";
		}

		int lastcomma = itemListStr.lastIndexOf(", ");
		itemListStr = itemListStr.substring(0, lastcomma);

		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemListStr + "입니다.");
		System.out.println();

	}

	@Override
	public String toString() {
		return "Buyer [name=" + getName() + ", money=" + money + ", bonusPoint=" + bonusPoint + ", itemArr="
				+ Arrays.toString(itemArr) + ", cnt=" + cnt + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
