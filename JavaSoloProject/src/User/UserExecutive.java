package User;

import java.util.Scanner;
import LottoMachine.*;

public class UserExecutive{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		RandomMachine machine = new RandomMachine();
		
		String playerName = "";
		int money = 0;
		int round = 0;
		
		
		
		System.out.println("사용자의 이름을 입력해주세요.");
		playerName = scan.next();
		System.out.println("현재의 소지금을 입력해주세요.");
		money = scan.nextInt();
		System.out.println("복권을 몇 번 사실 건가요?");
		round = scan.nextInt();
		
		
		
//		machine.createLotto(round);
//		machine.drawLotto(round, money);
//		machine.dealing(money, round);
//		machine.userInfo(playerName, money, round);
		
		
	}

}
