package Deck;

import Deck.Deck.Card;

public class DeckMain {
	
	public static void main(String[] args ){
		
		Deck d = new Deck();
		
		d.shuffle();
		
		for(int i = 0; i < 10; i++){
			Card c = d.handOutNextCard();
			System.out.println("Drew card: " + c.getSuite().toString() + " nr " + c.getRank());
		}
		
		System.out.println("Cards left in deck: " + d.deckSize());
	}
}
