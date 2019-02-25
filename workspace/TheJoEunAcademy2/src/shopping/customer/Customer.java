package shopping.customer;

import shopping.product.Product;

public class Customer {

	public int money = 500;
	public String name = "";
	public String productName = "";

	public Customer () {
		
	}
	
	public Customer (String name, int money) {

		this.money = money;
		this.name = name;
		
	}
	
	public void buy(Product product) {
		
		if (money < product.price) {
			System.out.println(name + "님의 잔액이 부족하여 물건을 살 수 없습니다.");
			System.out.println("부족한 금액 : " + (product.price - money) + "만원");
			return;
		}
		
		this.money = money - product.price;
		this.productName = product.name;
		
		System.out.println(name + "님께선 " + product.name + "(을)를 구입하셨습니다.");
		
	}
	
	public void buyAfterBill (Product product) {

		System.out.println(productName + "를 구매한 후 사용자의 정보");
		System.out.println(name + "님의 현재 남은 돈은 " + money + "입니다.");
		System.out.println();
		
	}

}
