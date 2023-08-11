package week06;

public class Card {
	//writing down the names and values  
	
	private int name;
	private int value;
	
	//Setting our constructors
	public Card (int value, int name) {
		this.name = name;
		this.value = value;
	}
	
	public Card (int number) { // since they are 52 cards in deck we will dive them both by 13 
		this.name = number / 13;
		this.value = number % 13;
	}
	
	//getters and setters 
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	// using describe to write down all the cards names and their values and be able to 
	//see which cards have been used in the game 
	public String describe() {
		
			String[] suits = {"Clubs","Dimonds","Hearts","Spades"};
			String[] values = {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten",
					"Jack","Queen","King","Ace"};
		
		return values[value] + " of " + suits[name];
		// we use the return method to put order in the card display on the console 
	}
		
		
		
		
		
			
}