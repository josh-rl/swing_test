package app;

import java.util.HashMap;

public class Player {
	public static int playerCount = 0;

	public String name;
	public HashMap<ScoreTypes, Integer> scoreMap;
	public int yahtzeeCount;

	public Player() {
		name = "Player " + Player.playerCount; 
		playerCount++;
		scoreMap = new HashMap<>();
		for (ScoreTypes st : ScoreTypes.values()) {
			scoreMap.put(st, 0);
		}
		yahtzeeCount = 0;
	}

	public Player(String name) {
		this.name = name;
		playerCount++;
		scoreMap = new HashMap<>();
		for (ScoreTypes st : ScoreTypes.values()) {
			scoreMap.put(st, 0);
		}
		yahtzeeCount = 0;
	}

	public void updateScore(ScoreTypes st, int num) {
		scoreMap.put(st, num);
	}

	public int getTopTotal() {
		int ret = 0;
		ret += scoreMap.get(ScoreTypes.scoreOne);
		ret += scoreMap.get(ScoreTypes.scoreTwo);
		ret += scoreMap.get(ScoreTypes.scoreThree);
		ret += scoreMap.get(ScoreTypes.scoreFour);
		ret += scoreMap.get(ScoreTypes.scoreFive);
		ret += scoreMap.get(ScoreTypes.scoreSix);
		return ret;
	}

	public int getBottomTotal() {
		int ret = 0;
		ret += scoreMap.get(ScoreTypes.score3OfKind);
		ret += scoreMap.get(ScoreTypes.score4OfKind);
		ret += scoreMap.get(ScoreTypes.scoreFullHouse);
		ret += scoreMap.get(ScoreTypes.scoreSmallStr);
		ret += scoreMap.get(ScoreTypes.scoreLargeStr);
		ret += scoreMap.get(ScoreTypes.scoreYahtzee);
		ret += scoreMap.get(ScoreTypes.scoreChance);
		ret += scoreMap.get(ScoreTypes.scoreYahtzeeBonus);
		return ret;
	}

	public int getGrandTotal() {
		return getTopTotal() + getTopTotal();
	}
}
