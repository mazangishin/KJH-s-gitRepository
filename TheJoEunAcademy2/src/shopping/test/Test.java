package shopping.test;

import shopping.customer.Customer;
import shopping.product.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customer = new Customer("김준혁", 20000);
		Tv tv = new Tv("조은 Tv", 100);
		Computer com = new Computer("조은 컴퓨터", 400);
		Book book = new Book("자바의 정석", 10000);
		Book book1 = new Book("OnePiece", 4000);

		
			customer.buy(tv);
			customer.buyAfterBill(tv);
			customer.buy(com);
			customer.buyAfterBill(com);
			customer.buy(book);
			customer.buyAfterBill(book);
			customer.buy(book1);
			customer.buyAfterBill(book1);
		
	}

}
