package week06;

public class App {

	public static void main(String[] args) {
		// we initiate the deck
		Deck playerDeck = new Deck ();
		//the game is played by 2 players 
		Player num1 = new Player("Olga");
		Player num2 = new Player("Tommy");
		
		//will add the shuffle method to start the game 
		//System.out.println(playerDeck.toString());
		playerDeck.shuffle();
		//System.out.println(playerDeck.toString());
		
		// our two players will start drawing their cards by using the for loop
		for(int i = 0; i < 26; i++) {
			num1.draw(playerDeck);
			num2.draw(playerDeck);
		}
		//num1.describe();
		//num2.describe();
		
		//We will compare their values and change the scores now 
		int num1Value, num2Value;
		
		for(int i = 0; i < 26; i++) {
			num1Value = num1.flip().getValue();
			num2Value = num2.flip().getValue();
			
			if (num1Value > num2Value) {
				num1.incrementScore();
				System.out.println(num1.getName() + " IS THE WINNER !! ");
			}
			else if (num2Value > num1Value) {
				System.out.println(num2.getName() + " IS THE WINNER !! ");
			} else {
				System.out.println("IT'S A DRAW ! ");
			}
			System.out.println("Current score : " + num1.getName() + " - " + num1.getScore()
			 + " " + num2.getName() + " - " + num2.getScore() + " \n");
		}
		
		//Let's display the winner of the game 
		System.out.println("The final score : " + num1.getName() + " - " + num1.getScore()
		+ " " + num2.getName() + " - " + num2.getScore() + "\n");
		
		if (num1.getScore() > num2.getScore()) {
			System.out.println(num1.getName() + " WINS THE GAME CONGRATULATIONS !!");
		} else if (num2.getScore() > num1.getScore()) {
			System.out.println(num2.getName() + " WINS THE GAME CONGRATULATIONS !!");
		}
		else { System.out.println(" IT'S A DRAW !"); }
		
		
		

	}

}
