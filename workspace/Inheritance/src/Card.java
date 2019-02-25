
public class Card {

	
	static String[] shape = { "♠", "◆", "♥", "♣" };
	static String[] number = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K" };
	
	String card = "";

	Card() {

	}

	Card (int shapeIndex, int numberIndex) {
		init(shapeIndex, numberIndex);
	}
	
	void init() {
		int shapeIndex = (int)(Math.random() * shape.length);
		int numberIndex = (int)(Math.random() * number.length);

		card = shape[shapeIndex] + number[numberIndex];

	}

	void init(int shapeIndex, int numberIndex) {
		card = shape[shapeIndex] + number[numberIndex];
	}
	
	
	String getCard() {
		return card;
	}

	
	
	
	
}
