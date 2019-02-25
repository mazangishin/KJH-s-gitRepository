
public class CardPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CardCase cardCase = new CardCase();
		Card card = null;;
		
		cardCase.shuffle();
		
		cardCase.cardsView();
		
		card = cardCase.pick(13);
		
		System.out.println(card.getCard());
		
	}

}
