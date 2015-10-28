import java.util.ArrayList;
import java.util.Random;
import java.lang.Object;

public class rockpaperscissors {
	public static void main(String[] args) {

	// explain the game
	System.out.println("This is rock, paper, scissors. Type computer to opt out. If you want to play, type one of these options:");
	ArrayList<String> hands = new ArrayList<String>();
	hands.add("rock");
	hands.add("paper");
	hands.add("scissors");
	for (String j : hands) {
		System.out.print(j + " ");
	}

	// get the user to throw a hand
	String input = System.console().readLine();
	String player1 = input;
	System.out.println("You said " + player1 + ".");

	
	// get the computer to throw a hand
	Random randomInt = new Random();
	int index = randomInt.nextInt(hands.size());
	String player2 = hands.get(index);
	System.out.println("The computer threw " + player2 + ".");

	if (player1.equals("computer")) {
		index = randomInt.nextInt(hands.size());
		player1 = hands.get(index);
		System.out.println("The computer also threw " + player1 + " for you.");
	}

	// tie
	if (player1.equals(player2)) {
		System.out.println("You threw the same thing as the computer. Have another go.");
	}
	
	// you threw rock
	else if (player1.equals("rock")) {
		if (player2.equals("paper")) {
			System.out.println("Paper covers rock. Womp womp.");
		}
		else if (player2.equals("scissors")) {
			System.out.println("Rock crushes scissors. You win!");
		}
		else {
			System.out.println("You threw rock and the computer threw something??");
		}
	}
	// you threw paper
	else if (player1.equals("paper")) {
		if (player2.equals("rock")) {
			System.out.println("Paper covers rock. You win!");
		}
		else if (player2.equals("scissors")) {
			System.out.println("Scissors cuts paper. Womp womp.");
		}
		else {
			System.out.println("You threw paper and the computer threw something??");
		}
	}
	// you threw scissors
	else if (player1.equals("scissors")) {
		if (player2.equals("rock")) {
			System.out.println("Rock crushes scissors. Womp womp.");
		}
		else if (player2.equals("paper")) {
			System.out.println("Scissors cuts paper. You win!");
		}
		else {
			System.out.println("You threw scissors and the computer threw something??");
		}
	}
	
	// something got screwed up or an input wasn't one of the four options: 
	// rock, paper, scissors, computer
	else {
		System.out.println("Do you even *have* hands??");
	}
	
}
	
}

