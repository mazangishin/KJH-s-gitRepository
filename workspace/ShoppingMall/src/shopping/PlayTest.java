package shopping;

import shopping.human.Customer;
import shopping.products.tv.Tv;
import shopping.shop.DigitalShop;

public class PlayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Customer customer = new Customer("홍길동", 5000);
		Tv tv = new Tv("메가tv", 5000);
		DigitalShop ds = new DigitalShop("더조은샵", 10000, tv);
		
		ds.showProducts();
		
		ds.sellProducts(customer);
		
		customer.myInfoView();
		
	}

}
