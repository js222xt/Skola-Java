package Game123;

import Game123.Deck.Card;
import java.util.Calendar;

public class Play123Main {
	
	public static void main(String[] args ){
		
		int won = 0;
		int lost = 0;
		int totalGames = 10000;
		for(int i = 0; i < totalGames; i++){
			Deck d = new Deck();
			
			d.shuffle(i + (int)Calendar.getInstance().getTimeInMillis());
			
			if(play123(d)){
				won++;
			}
			else{
				lost++;
			}
		}
		
		System.out.println("You have won: " + won + " times.");
		System.out.println("You have lost: " + lost + " times.");
		System.out.println("You have played: " + totalGames + " times.");
		System.out.println("% to win: " + ( (double)((double)won / (double)totalGames) * 100 ));
	}
	
	private static boolean play123(Deck d){
		int drawnCards = 0;
		while(d.deckSize() >= 1){
			Card c = d.handOutNextCard();
			drawnCards++;
			if(drawnCards % 3 == 1){
				// 1
				if(c.getRank() == 1){
					return false;
				}
			}
			if(drawnCards % 3 == 2){
				// 2
				if(c.getRank() == 2){
					return false;
				}
			}
			if(drawnCards % 3 == 0){
				// 3
				if(c.getRank() == 3){
					return false;
				}
			}
		}
		return true;
	}
}
