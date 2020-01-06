package com.task.rockPaperScissors.players;

public enum Player {
	ROCK {
		@Override
		public boolean evaluateResult(Player player) {
			return player == SCISSORS;
		}
	}, PAPER {
		@Override
		public boolean evaluateResult(Player player) {
			return player == ROCK;
		}
	}, SCISSORS {
		@Override
		public boolean evaluateResult(Player player) {
			return player == PAPER;
		}
	};

	/**
	 * A function that will parse the choice the player makes.
	 * @param choice
	 * @return return the player choice.
	 */
	public static Player parseChoice(String choice) {
		switch (choice.toLowerCase()) {
		case "r":
		case "rock":
			return ROCK;
		case "p":
		case "paper":
			return PAPER;
		case "s":
		case "scissors":
			return SCISSORS;
		}
		return null;
	}
	
	/**
	 * A function that evaluate the final result
	 * @param player
	 * @return true if the player1 wins, false if player1 loses.
	 */
	public abstract boolean evaluateResult(Player player);
}
