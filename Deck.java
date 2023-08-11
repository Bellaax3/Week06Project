package week06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	List<Card> cards = new ArrayList<Card>();{ // declares the list of a card
		
	}
	
	// constructors 
	public Deck() { // using the for loop to put in the info that there's 52 cards in it 
		cards = new ArrayList<Card> ();
		for (int i = 0; i < 52; i++) {
			cards.add(new Card(i));
		}
	}
	
	// Methods 
	
	public void shuffle() { // it will shuffle the cards for us or players
		Collections.shuffle(this.cards);
	}
	
	public Card draw() {
	   Card currentCard = cards.get(0);
	   cards.remove(0);
	   return currentCard;
	}// it will show the top card and also remove a card byt assigning it to a variable
	
	
	@Override
	public String toString() {
		for (Card card: cards) {
			System.out.println(card.describe());
		}
		return " ";
	}

	

}
