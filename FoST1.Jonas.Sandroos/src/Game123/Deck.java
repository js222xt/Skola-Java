package Game123;

import java.util.Random;

public class Deck {
	public static enum Suite{
		Heart,
		Spades,
		Diamonds,
		Clubs
	}
	
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
	
	public void shuffle(int seed){		
		if(cardsInDeck == maxCards){
			for(int i = 0; i < cards.length; i++){
				Random rand = new Random(seed + i);
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
	
	public Card handOutNextCard(){
		return cards[--cardsInDeck];
	}
	
	public int deckSize(){
		return cardsInDeck;
	}
	
	class Card{		
		private int rank;
		private Suite suite;
		
		public Card(int rank, Suite suite){
			this.rank = rank;
			this.suite = suite;
		}
		
		public void setRank(int rank){
			this.rank = rank;
		}
		
		public void setSuite(Suite suite){
			this.suite = suite;
		}
		
		public int getRank(){
			return this.rank;
		}
		
		public Suite getSuite(){
			return this.suite;
		}
	}
}
