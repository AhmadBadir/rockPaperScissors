package com.task.rockPaperScissors.results;

public enum Result {
	TIE("Tie"), PLAYER1_WINS("Player 1 wins the round!!"), PLAYER2_WINS("Player 2 wins the round!!");

	private String result;

	private Result(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return result;
	}
}
