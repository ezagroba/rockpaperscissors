import java.util.*;

public class rockpaperscissors {
	public static void main(String[] args) {

		// explain the game
		System.out.println("This is rock, paper, scissors. If you want to play, type one of these options:");
		ArrayList<String> hands = new ArrayList<String>();
		hands.add("rock");
		hands.add("paper");
		hands.add("scissors");
		System.out.println("If you're too lazy, type computer to let it face off against itself.");

		for (String j : hands) {
			System.out.print(j + " ");
		}

		// get the user to throw a hand
		String input = System.console().readLine();
		String userHand = input;

		// if the user doesn't want to throw a hand, get the computer to throw both hands

		// get the computer to throw a hand
		

		/* 
		public computerHand(){
			String random = (hands[new Random().nextInt(hands.length)]);
			return random;
		}
		*/

		// tell the user who won
		switch (userHand) {
			// computer
			/*
			case "computer":
				userHand = hands[new Random().nextInt(hands.length)];
				*/
			// rock
			case "rock": 
				System.out.println("You threw rock. Rock crushes scissors. You win!");
				break; 
			// paper
			case "paper": 
				System.out.println("You threw paper. Scissors cuts paper. Womp womp.");
				break;
			// scissors
			case "scissors": 
				System.out.println("You threw scissors. So did the computer. Have another go.");
				break;
			default:
				System.out.println("Do you even *have* hands??");

		}

	}
}

