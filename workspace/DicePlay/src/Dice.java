
public class Dice {

	int dicespot = 0;
	
	void diceThrow () {
		System.out.println("주사위를 굴립니다.");
		dicespot = (int)(Math.random() * 6)+1;
	}
	
	void diceView () {
		System.out.print("주사위를 굴려서 나온 숫자는 ");
		System.out.println(dicespot + "입니다.");
		
	}
}
