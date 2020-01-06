package com.task.rockPaperScissors;

import java.util.Random;

import com.task.rockPaperScissors.players.Player;
import com.task.rockPaperScissors.results.Result;

/**
 * 
 * @author abadir
 *
 */
public class RockPaperScissorsGame {

	private final static int ITERATIONS = 100;
	private final static String[] choices = new String[] { "r", "p", "s" };

	public static void main(String[] args) {

		Random rndChoice = new Random();
		Player player1 = Player.parseChoice(choices[0]);
		Player player2;
		int choiceIndex;

		for (int i = 0; i < ITERATIONS; i++) {
			System.out.println("********* Round " + (i + 1) + "*********");
			choiceIndex = rndChoice.nextInt(3);
			player2 = Player.parseChoice(choices[choiceIndex]);
			System.out.println("Player 1 choice is: " + player1);
			System.out.println("Player 2 choice is: " + player2);
			if (player1.equals(player2)) {
				System.out.println("Result: " + Result.TIE);
			} else if (player1.evaluateResult(player2)) {
				System.out.println("Result: " + Result.PLAYER1_WINS);
			} else {
				System.out.println("Result: " + Result.PLAYER2_WINS);
			}
		}
	}
}
