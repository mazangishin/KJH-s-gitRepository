package shopping.user;

import shopping.product.*;

public class Buyer {

	private int money = 1000;

	public void buy(Product product) {
		
		if (money < product.getPrice()) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			System.out.println("부족한 금액 : " + (product.getPrice() - money));
			return;
		}
		
		money = money - product.getPrice();
		
		System.out.println(product.getname() + "(을)를 구매하셨습니다.");
		
	}
	
	public void setMoney (int money) {
		this.money = money;
	}
	
	public int getMoney () {
		return money;
	}
	
	public String toString () {
		return "money";
	}
}
