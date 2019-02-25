
public class CardCase {

	int numOfCards = Card.shape.length * Card.number.length;
	Card[] cardArr = new Card[numOfCards];

	CardCase() {
		
		int totalCnt = 0;

		for (int i = 0; i < Card.shape.length; i++) {
			
			for (int n = 0; n < Card.number.length; n++) {
				
				cardArr[totalCnt++] = new Card(i, n);
				
			}
		}

	}

	Card pick() {
		
		int index = (int) (Math.random() * numOfCards);
//		Card card = cardArr[index];
		Card card = pick(index);
		return card;
		
	}

//	지정된 위치의 카드를 뽑는다.

	Card pick(int index) {

		return cardArr[index];

	}

	void shuffle() {
		
		int rand = 0;
		Card temp = null;

		for (int i = 0; i < cardArr.length; i++) {
			
			rand = (int) (Math.random() * numOfCards);

			temp = cardArr[i];
			cardArr[i] = cardArr[rand];
			cardArr[rand] = temp;
			
		}
	}

	void cardsView() {
		
		for (int i = 0; i < cardArr.length; i++) {
			
			System.out.println(cardArr[i].getCard() + " ");
			
			if ((i + 1) % 13 == 0) {
				
				System.out.println();
				
			}

		}

	}
	
	
	
	
}
