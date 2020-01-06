package com.task.rockPaperScissors;

import static org.junit.Assert.*;

import org.junit.Test;

import com.task.rockPaperScissors.players.Player;

public class PlayerTest {

	@Test
	public void testParseChoice() {
		String choice = "p";
		Player player = Player.parseChoice(choice);
		assertEquals("Choice " + choice, Player.PAPER, player);
		choice = "paper";
		player = Player.parseChoice(choice);
		assertEquals("Choice " + choice, Player.PAPER, player);
		choice = "PaPer";
		player = Player.parseChoice(choice);
		assertEquals("Choice " + choice, Player.PAPER, player);
		choice = "r";
		player = Player.parseChoice(choice);
		assertEquals("Choice " + choice, Player.ROCK, player);
		choice = "ROCK";
		player = Player.parseChoice(choice);
		assertEquals("Choice " + choice, Player.ROCK, player);
		choice = "s";
		player = Player.parseChoice(choice);
		assertEquals("Choice " + choice, Player.SCISSORS, player);
		choice = "scissors";
		player = Player.parseChoice(choice);
		assertEquals("Choice " + choice, Player.SCISSORS, player);
		choice = "test";
		player = Player.parseChoice(choice);
		assertEquals("Choice " + choice, null, player);
		// fail("Not yet implemented");
	}

	@Test
	public void testEvaluateResult() {

		// rock test case
		Player player1 = Player.parseChoice("r");
		Player player2 = Player.parseChoice("r");
		assertEquals(player1.evaluateResult(player2), false);
		player2 = Player.parseChoice("s");
		assertEquals(player1.evaluateResult(player2), true);
		// paper test case
		player1 = Player.parseChoice("p");
		player2 = Player.parseChoice("p");
		assertEquals(player1.evaluateResult(player2), false);
		player2 = Player.parseChoice("r");
		assertEquals(player1.evaluateResult(player2), true);

		// scissor test case
		player1 = Player.parseChoice("s");
		player2 = Player.parseChoice("s");
		assertEquals(player1.evaluateResult(player2), false);
		player2 = Player.parseChoice("p");
		assertEquals(player1.evaluateResult(player2), true);
	}

}
