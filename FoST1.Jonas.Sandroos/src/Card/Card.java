package Card;

public class Card {

	public static enum Suite{
		Heart,
		Spades,
		Diamonds,
		Clubs
	}
	
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
