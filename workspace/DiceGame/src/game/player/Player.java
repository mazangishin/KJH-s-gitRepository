package game.player;

import game.dice.Dice;


public class Player {

	String name = "";
	int sum = 0;
	Dice dice = new Dice();
	
	public Player (String name) {
		this.name = name;	
	}
	
	public void playGame () {
		
		System.out.println("게임 시작!");
		
		while (true) {
			if (sum >= 15) {
				
				dice.diceThrow();
				dice.diceView();
				
				this.sum = sum + dice.num;
				
				System.out.println(name + "(이)가 지금까지 굴린 주사위 눈의 합계는 : " + sum);
				System.out.println("축하합니다! 주사위 눈의 합계가 15가 넘어가");
				System.out.println("게임이 종료되었습니다." + name + "(이)가  승리하였습니다.");
				
				break;
				
			}else if (sum < 15) {
				
				dice.diceThrow();
				dice.diceView();
				
				this.sum = sum + dice.num;
				
				System.out.println(name + "의 주사위 눈의 합계는 " + sum + "입니다.");
				
			}
		}
	}
	
}
