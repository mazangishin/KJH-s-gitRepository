package shopping.test;

import java.util.Scanner;

import shopping.customer.Customer;
import shopping.product.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String cus2Name = "";
		String aCom = "";
		String aTv = "";
		
		int cus2Money = 0;
		int aComPrice = 0;
		int aTvPrice = 0;
		
		Customer customer = new Customer();
		Tv tv = new Tv();
		Computer com = new Computer();
		
		aCom = "아카데미 Computer";
		aTv = "아카데미 Tv";
		
		customer.buy(tv);
		
		System.out.println("조은 Tv를 구매한 후 사용자의 정보");
		System.out.println("당신의 현재 남은 돈은 " + customer.money + "만원입니다.");
		System.out.println();
		
		customer.buy(com);
		
		System.out.println("조은 Computer를 구매한 후 사용자의 정보");
		System.out.println("당신의 현재 남은 돈은 " + customer.money + "만원입니다.");
		System.out.println();
		System.out.println("================================================");
		System.out.println();
		
		System.out.println("사용자의 이름을 입력해주세요.");
		cus2Name = scan.nextLine();
		System.out.println("사용자의 소지금을 입력해주세요.");
		cus2Money = scan.nextInt();
		System.out.println("아카데미 Computer의 가격을 입력해주세요.");
		aComPrice = scan.nextInt();
		System.out.println();		
		
		Customer customer2 = new Customer(cus2Name, cus2Money);
		Tv tv1 = new Tv(aTv, aTvPrice);
		Computer com1 = new Computer(aCom, aComPrice);
		
		customer2.buy(tv);
		
		System.out.println(tv.name + "를 구매한 후 사용자의 정보");
		System.out.println("현재 남은 돈은 " + customer2.money + "만원입니다.");
		System.out.println();
		
		customer2.buy(com);
		
		System.out.println(com.name + "를 구매한 후 사용자의 정보");
		System.out.println("현재 남은 돈은 " + customer2.money + "만원입니다.");
		System.out.println();
		
		customer2.buy(com1);
		
		System.out.println(aCom + "를 구매하지 못한 사용자의 정보");
		System.out.println("현재 남은 돈은 " + customer2.money + "만원입니다.");
		System.out.println();
	}

}
