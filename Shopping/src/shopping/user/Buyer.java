package shopping.user;

import shopping.product.*;

public class Buyer {

	public int money = 1000;
	public int bonusPoint = 0;

	public void buy(Tv tv) {
		if (money < tv.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		} else if (money == 1000) {
			System.out.println("지름신을 주체하지 못하고 하이마트에 들어왔습니다.");
		} else if (money > 0) {
			System.out.println("돈이 남았습니다. 다른 곳으로 눈을 돌립니다.");
		}

		money = money - tv.price; // 가진 돈에서 구입한 제품의 가격을 뺀다
		bonusPoint = bonusPoint + tv.bonusPoint; // 제품의 보너스 점수를 추가한다.

		String productNameStr = "";
		productNameStr = tv.myProductName();
		System.out.println(productNameStr + "를 구입하셨습니다.");
	}

	public void buy(Computer computer) {
		if (money < computer.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		} else if (money == 1000) {
			System.out.println("지름신을 주체하지 못하고 하이마트에 들어왔습니다.");
		} else if (money > 0) {
			System.out.println("돈이 남았습니다. 다른 곳으로 눈을 돌립니다.");
		}

		money = money - computer.price;
		bonusPoint = bonusPoint + computer.bonusPoint;
		System.out.println(computer.myProductName() + "를 구입하셨습니다.");
	}

	public void buy(Notebook notebook) {
		if (money < notebook.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		} else if (money == 1000) {
			System.out.println("지름신을 주체하지 못하고 하이마트에 들어왔습니다.");
		} else if (money > 0) {
			System.out.println("돈이 남았습니다. 다른 곳으로 눈을 돌립니다.");
		}

		money = money - notebook.price; // 가진 돈에서 구입한 제품의 가격을 뺀다
		bonusPoint = bonusPoint + notebook.bonusPoint; // 제품의 보너스 점수를 추가한다.
		String productNameStr = "";
		productNameStr = notebook.myProductName();
		System.out.println(productNameStr + "를 구입하셨습니다.");
	}
}
