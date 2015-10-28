import java.util.ArrayList;
import java.util.Random;

public class rockpaperscissors {
	public static void main(String[] args) {

	// explain the game
	System.out.println("This is rock, paper, scissors. If you want to play, type one of these options:");
	ArrayList<String> hands = new ArrayList<String>();
	hands.add("rock");
	hands.add("paper");
	hands.add("scissors");
	System.out.println("If you're too lazy, type computer to let the computer be you.");

	for (String j : hands) {
		System.out.print(j + " ");
	}

	// get the user to throw a hand
	String input = System.console().readLine();
	String player1 = input;
	// if the user doesn't want to throw a hand, get the computer to throw both hands
	// get the computer to throw a hand
		

	Random randomInt = new Random();
	System.out.println(randomInt);

	int index = randomInt.nextInt(hands.size());
	System.out.println(index);

	String player2 = hands.get(index);
	System.out.println(randomInt);

	// tie
	if (player1 == player2) {
		System.out.println("You threw " + player1 + ". So did the computer. Have another go.");
	}
		
	// you threw rock
	else if (player1 == "rock") {
		if (player2 == "paper") {
			System.out.println("You threw rock. The computer threw paper. Paper covers rock. Womp womp.");
		}
		else if (player2 == "scissors") {
			System.out.println("You threw rock. The computer threw scissors. Rock crushes scissors. You win!");
		}
		else {
			System.out.println("You threw rock and the computer threw something??");
		}
	}
	// you threw paper
	else if (player1 == "paper") {
		if (player2 == "rock") {
			System.out.println("You threw paper. The computer threw rock. Paper covers rock. You win!");
		}
		else if (player2 == "scissors") {
			System.out.println("You threw paper. The computer threw scissors. Scissors cuts paper. Womp womp.");
		}
		else {
			System.out.println("You threw paper and the computer threw something??");
		}
	}
	// you threw scissors
	else if (player1 == "scissors") {
		if (player2 == "rock") {
			System.out.println("You threw scissors. The computer threw rock. Rock crushes scissors. Womp womp.");
		}
		else if (player2 == "paper") {
			System.out.println("You threw scissors. The computer threw paper. Scissors cuts paper. You win!");
		}
		else {
			System.out.println("You threw scissors and the computer threw something??");
		}
	}
	// player2 or both hands got messed up
	else {
		System.out.println("Do you even *have* hands??");
	}
	
}
	
}

