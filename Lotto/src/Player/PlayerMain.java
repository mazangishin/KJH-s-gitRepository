package Player;
import java.util.Scanner;
import Shop.*;

public class PlayerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Scanner scan = new Scanner(System.in);
		String userName = "";
		LottoMachine machine = new LottoMachine();
		LottoPrint print = new LottoPrint();
		
		
		int playTime = 0;
		int playerMoney = 0;
		int[] lottoArr = new int[30];
		
		
		
		System.out.println("사용자의 이름을 입력해주세요.");
		
		userName = scan.next();
		
		System.out.println("사용자의 소지금을 입력해주세요.");
		
		playerMoney = scan.nextInt();
		
		System.out.println("한 게임에 1000원이 소비됩니다.");
		System.out.println("몇 번의 게임을 구매하실 건가요? 1 에서 5 사이의 숫자를 입력해주세요.");
		
		playTime = scan.nextInt();
		
		System.out.println();
		
		
		machine.lottoCreate(playerMoney, playTime, lottoArr);
		playerMoney = machine.payment(playerMoney, playTime);
		print.lottoInfo(playerMoney, playTime, lottoArr);
	
		
		
	}

}
