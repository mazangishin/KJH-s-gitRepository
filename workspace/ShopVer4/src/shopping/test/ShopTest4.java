package shopping.test;

import java.util.Scanner;

import shopping.product.Computer;
import shopping.product.Tv;
import shopping.user.*;

public class ShopTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		Buyer[] userArr = new Buyer[4];
		Tv tv1 = new Tv();
		Computer com1 = new Computer();
		String name = "";
		int money = 0;
		
		try {
			for (int i = 0; i < userArr.length; i++) {
				System.out.println("구매자의 이름을 입력해주세요.");
				name = scan.nextLine();
				System.out.println("구매자의 소지금을 입력해주세요.");
				money = Integer.parseInt(scan.nextLine());

				userArr[i] = new Buyer(name, money);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("소지금은 숫자만 입력해주세요.");
		}

		for (int i = 0; i < 2; i++) {
			userArr[0].buy(tv1);			
			userArr[1].buy(tv1);			
		}
		
		for (int i = 0; i < 7; i++) {
			userArr[1].buy(com1);
		}
		
		for (int i = 0; i < userArr.length; i++) {
			userArr[i].showInfo();
		}
		
	}

}
