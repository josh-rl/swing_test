package control;

import model.Player;
import model.ScoreTypes;
import model.State;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;

public class Game extends State implements Control {
	public Game() {
		rand = new Random();
		currPlayer = null;
		players = new ArrayList<>();
		currPlayerIndx = 0;
		selected = null;
		diceVals = new int[5];
		Arrays.fill(diceVals, 0);
		diceRollState = new boolean[5];
		Arrays.fill(diceRollState, true);
		rollsRem = 3;
	}

	@Override
	public void addPlayer() {
		players.add(new Player());
	}

	@Override
	public void addPlayer(String name) {
		players.add(new Player(name));
	}

	@Override
	public void removePlayer(int amount) {
		int lim = Player.playerCount;
		for (int i = lim - 1; i > lim - amount; i--) {
			players.remove(i);
		}
	}

	@Override
	public void startGame() {
		currPlayer = players.get(0);
	}

	@Override
	public void rollDie1() {
		diceVals[0] = rand.nextInt(6) + 1;
	}

	@Override
	public void rollDie2() {
		diceVals[1] = rand.nextInt(6) + 1;
	}

	@Override
	public void rollDie3() {
		diceVals[2] = rand.nextInt(6) + 1;
	}

	@Override
	public void rollDie4() {
		diceVals[3] = rand.nextInt(6) + 1;
	}

	@Override
	public void rollDie5() {
		diceVals[4] = rand.nextInt(6) + 1;
	}

	@Override
	public void toggleDie1() {
		diceRollState[0] = !diceRollState[0];
	}

	@Override
	public void toggleDie2() {
		diceRollState[1] = !diceRollState[1];
	}

	@Override
	public void toggleDie3() {
		diceRollState[2] = !diceRollState[2];
	}

	@Override
	public void toggleDie4() {
		diceRollState[3] = !diceRollState[3];
	}

	@Override
	public void toggleDie5() {
		diceRollState[4] = !diceRollState[4];
	}

	@Override
	public boolean canRoll() {
		return rollsRem > 0;
	}

	@Override
	public void doRolls(int rolls) {
		for (int i = 0; i < rolls; i++) {
			if (diceRollState[0]) rollDie1();
			if (diceRollState[1]) rollDie2();
			if (diceRollState[2]) rollDie3();
			if (diceRollState[3]) rollDie4();
			if (diceRollState[4]) rollDie5();
		}
		setState();
	}

	@Override
	public boolean canSelect(ScoreTypes st) {
		if (st == ScoreTypes.scoreYahtzeeBonus && currPlayer.yahtzeeCount < 1)
			return false;
		return currPlayer.scoreMap.get(st) == 0;
	}

	@Override
	public void makeSelection(ScoreTypes st) {
		if (canSelect(st)) selected = st;
	}

	@Override
	public boolean canEnd() {
		return selected != null && rollsRem != 3;
	}

	@Override
	public boolean endTurn() {
		if (canEnd()) {
			currPlayer.updateScore(selected, getSelectionScore(selected));
			selected = ScoreTypes.scoreTop;
			currPlayer.updateScore(selected, getSelectionScore(selected));
			selected = ScoreTypes.scoreBonus;
			currPlayer.updateScore(selected, getSelectionScore(selected));
			selected = ScoreTypes.scoreTopTotal;
			currPlayer.updateScore(selected, getSelectionScore(selected));
			selected = ScoreTypes.scoreBottomTotal;
			currPlayer.updateScore(selected, getSelectionScore(selected));
			selected = ScoreTypes.scoreGrandTotal;
			currPlayer.updateScore(selected, getSelectionScore(selected));
			clearState();
			if (currPlayerIndx + 1 < players.size()) {
				currPlayerIndx++;
			} else {
				currPlayerIndx = 0;
			}
			currPlayer = players.get(currPlayerIndx);
			selected = null;
			Arrays.fill(diceVals, 0);
			Arrays.fill(diceRollState, true);
			rollsRem = 3;
		}
		return false;
	}
}
