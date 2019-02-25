package shopping.human;

import shopping.products.tv.Tv;

public class Customer {

	public String name = "";
	public int money = 0;
	public Tv tv = null;
	
	public Customer () {
		
	}
	
	public Customer (String name, int money) {
		
		this.name = name;
		this.money = money;
		
	}
	
	public void myInfoView () {
		
		System.out.println("이름: " + name);
		System.out.println("소지금: " + money);
		
		if (tv == null) {
			System.out.println("소지한 tv가 없습니다.");
		}else {
			System.out.println("소지한 tv 정보");
			tv.myInfoView();
		}
		
		System.out.println();
		
	}
	
}
