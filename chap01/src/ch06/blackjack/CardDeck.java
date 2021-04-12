package ch06.blackjack;

public class CardDeck {
	public static final String[] pattern = {"Spades","Hearts","Diamonds","Clubs"};
	public static final String[] symbole = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	private final Card[] CARD_ARR = new Card[pattern.length * symbole.length];
	
	
	
	public CardDeck() {
		init();
	}
	
	private void init() {
		int cnt=0;
//		for(int i=0; i<pattern.length; i++) {
//		for(int j=0; j<symbole.length; j++) {
//			CARD[cnt] = new Card(pattern[i],symbole[j]);
//			cnt++;
//		}
//	}
		for(String i: pattern) {
			for(String j:symbole) {
				CARD_ARR[cnt++] = new Card(i,j);
			}
		}
	}
	
//	public void printDeck() {
//		for (Card card2 : CARD) {
//			System.out.println(card2);
//		}
//	}
	
	private int getRandomIdx() {
		return (int)(Math.random() * CARD_ARR.length);
	}
	
	public Card getOneCard() {
		Card result = null;
		int ran = 0;
		
		while(true) {
			ran=getRandomIdx();
			if(CARD_ARR[ran] != null) {
				result = CARD_ARR[ran];
//				System.out.println(result);
				CARD_ARR[ran] = null;
				
				return result;
			}
		}
	}
	
	public void printAll() {
		for (Card card : CARD_ARR) {
			System.out.println(card);
		}
	}

}
