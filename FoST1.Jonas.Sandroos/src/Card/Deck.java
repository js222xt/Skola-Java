package Card;

import java.util.Random;

import Card.Card.Suite;

public class Deck {

	private int maxCards;
	private int maxCardRank;
	private Card[] cards;
	private int cardsInDeck;
	
	public Deck(){
		// Create a deck
		maxCardRank = 13;
		maxCards = maxCardRank * Suite.values().length;
		cards = new Card[maxCards];
		
		int count = 0;
		for(int y = 0; y < Suite.values().length; y++){
			for(int j = 0; j < maxCardRank; j++){
				cards[count] = new Card(j, Suite.values()[y]);
				count++;
			}
		}
		
		cardsInDeck = cards.length;
	}
	
	public void shuffle(){		
		if(cardsInDeck == maxCards){
			for(int i = 0; i < cards.length; i++){
				Random rand = new Random(i);
				int randNr = rand.nextInt(cards.length);
				Card temp = cards[i];
				cards[i] = cards[randNr];
				cards[randNr] = temp;
			}
		}
		else{
			System.out.println("Could not shuffle since deck is not full");
		}
		
	}
	
	public Card deal(){
		return cards[--cardsInDeck];
	}
	
	public int cardsInDeck(){
		return cardsInDeck;
	}
	
}
