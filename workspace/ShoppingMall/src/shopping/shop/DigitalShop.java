package shopping.shop;

import shopping.human.Customer;
import shopping.products.tv.Tv;

public class DigitalShop {

	public String shopName = "";
	public Tv tv = null;
	public int money = 0;
	
	public DigitalShop () {
		
		shopName = "더조은 샵";
		money = 100000;		//10만원
		
	}
	
	public DigitalShop (String shopName, int money) {
		
		this.money = money;
		this.shopName = shopName;
		
	}

	public DigitalShop (String shopName, int money, Tv tv) {
		
		this.money = money;
		this.shopName = shopName;
		this.tv = tv;
		
	}
	// 가게에 존재하는 제품 보여주기
	public void showProducts () {
		
		System.out.println("가게이름: " + shopName);
		tv.myInfoView();
		
	}
	// 가지고 있는 제품을 고객에게 판매하는 기능
	public void sellProducts (Customer customer) {
		
		money = money + tv.price;
		customer.money = customer.money - tv.price;
		customer.tv = tv;
		tv = null;
		
		System.out.println("tv를 팔았습니다.");
		System.out.println();
	}
	
	
}
