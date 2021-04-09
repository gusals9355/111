package ch06.blackjack;

public class CardDeck {
	public static final String[] pattern = {"Spades","Hearts","Diamonds","Clubs"};
	public static final String[] symbole = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	private final Card[] CARD = new Card[pattern.length * symbole.length];
	
	
	
	public CardDeck() {
		int cnt=0;
//		for(int i=0; i<pattern.length; i++) {
//			for(int j=0; j<symbole.length; j++) {
//				CARD[cnt] = new Card(pattern[i],symbole[j]);
//				cnt++;
//			}
//		}
		for(String i: pattern) {
			for(String j:symbole) {
				CARD[cnt++] = new Card(i,j);
			}
		}
	}
	
	public void printDeck() {
		for (Card card2 : CARD) {
			System.out.println(card2);
		}
	}

	
}
