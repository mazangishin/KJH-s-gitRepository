package shopping.customer;

import shopping.product.Product;

public class Customer {

	public int money = 500;
	public String name = "";

	public Customer () {
		
	}
	
	public Customer (String name, int money) {

		this.money = money;
		this.name = name;
	}
	
	public void buy(Product product) {
		
		if (money < product.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			System.out.println("부족한 금액 : " + (product.price - money) + "만원");
			return;
		}
		
		money = money - product.price; // 가진 돈에서 구입한 제품의 가격을 뺀다
		
		System.out.println(product.name + "를 구입하셨습니다.");
	}
	

}
