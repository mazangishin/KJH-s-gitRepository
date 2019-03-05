package exam.test.shoppingMall;

import java.util.Scanner;

public class CustomerUtil {

	public Customer getCreateCustomer() {
		Customer customer = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("고객님의 성함을 입력해주세요.");
		String name = scan.nextLine();
		System.out.println("고객님의 나이를 입력해주세요.");
		int age = scan.nextInt();
		System.out.println("고객님의 소지금을 입력해주세요.");
		int money = scan.nextInt();

		return customer;
	}
	
}
