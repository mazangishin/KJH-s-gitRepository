package shopping.test2;

import shopping.product.Computer;
import shopping.product.Notebook;
import shopping.product.Tv;
import shopping.user.*;

public class ShopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Buyer user1 = new Buyer();
		Tv tv1 = new Tv();
		Computer com1 = new Computer();
		Notebook note1 = new Notebook();
		
		
		user1.buy(tv1);
		
		System.out.println("Tv를 구매한 후 사용자의 정보");
		System.out.println("현재 남은 돈은 " + user1.money + "만원입니다.");
		System.out.println("현재 보너스 점수는 " + user1.bonusPoint + "점입니다.");
		System.out.println();
		
		user1.buy(note1);
		
		System.out.println("Notebook를 구매한 후 사용자의 정보");
		System.out.println("현재 남은 돈은 " + user1.money + "만원입니다.");
		System.out.println("현재 보너스 점수는 " + user1.bonusPoint + "점입니다.");
		System.out.println();
		
		user1.buy(com1);
		
		System.out.println("Computer를 구매한 후 사용자의 정보");
		System.out.println("현재 남은 돈은 " + user1.money + "만원입니다.");
		System.out.println("현재 보너스 점수는 " + user1.bonusPoint + "점입니다.");
		
		
		
	}

}
