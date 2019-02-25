
public class CardGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Card card = new Card();
		String myCard = "";
		int shapeIndex = 0;
		int cardChoiceNumber = 0;
		
		//card.init();
		
		shapeIndex = 3;
		cardChoiceNumber = 3;
		
		card.init(shapeIndex, cardChoiceNumber);
		
		myCard = card.getCard();
		
		System.out.println("당신에게 준 카드는 ");
		System.out.println(myCard);
		
		
		
	}

}
