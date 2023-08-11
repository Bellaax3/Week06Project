package week06;

import java.util.ArrayList;

public class Player {
	// fields
	private String name;
	private int score;
	private ArrayList<Card> hand;

	//Constructor // it assigns the values to the variables 
	public Player(String firstName) {
		this.name = firstName;
		this.score = 0;
		this.hand = new ArrayList <Card> ();
	}
	
	//getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	} // will not use the set score because we will be adding to it instead of writing it ourselves
	
	// methods
	
	public void describe() {
		System.out.println("\n" + name + " has these following cards: ");
		for(Card card : hand) {
			System.out.println(card.describe());
		}
		//it describes the cards that our player has in their hand
	}
	
	public Card flip() {
		Card currentCard = hand.get(0);
		hand.remove(0);
		System.out.println(name + " has " + currentCard.describe());
		return currentCard;
	} // the flip method removes the top card of the player and it prints out more organized what cards
	// the player has 
	
	public void draw(Deck deck) {
		Card currentCard = deck.draw();
		hand.add(currentCard);
	} // it draws a card from the deck and puts it on the hand of the player

	
	public void incrementScore() {
		this.score++;
	} // it keeps score by adding it by one
	
	
	
	
	
	
}



