package model;

import java.util.HashMap;

/**
 * Player state
 */
public class Player {
	public static int playerCount = 0;
	public String name;
	public HashMap<ScoreTypes, Integer> scoreMap;
	public HashMap<ScoreTypes, Boolean> pickMap;
	public int yahtzeeCount;

	/**
	 * Names player based on player count
	 */
	public Player() {
		playerCount++;
		name = "Player " + Player.playerCount; 
		scoreMap = new HashMap<>();
		for (ScoreTypes st : ScoreTypes.values()) {
			scoreMap.put(st, 0);
			pickMap.put(st, false);
		}
		yahtzeeCount = 0;
	}

	/**
	 * Player with given name
	 * @param name String
	 */
	public Player(String name) {
		playerCount++;
		this.name = name;
		scoreMap = new HashMap<>();
		for (ScoreTypes st : ScoreTypes.values()) {
			scoreMap.put(st, 0);
			pickMap.put(st, false);
		}
		yahtzeeCount = 0;
	}

	/**
	 * Intended to be used with State.java method values
	 * @param st ScoreType
	 * @param num Integer
	 */
	public void updateScore(ScoreTypes st, int num) {
		scoreMap.put(st, num);
		pickMap.put(st, true);
	}

	/**
	 * Adds all scores in top half before bonus
	 * @return Integer
	 */
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

	/**
	 * Adds all scores in top half with bonus
	 * @return Integer
	 */
	public int getTopGrandTotal() {
		int ret = 0;
		ret += scoreMap.get(ScoreTypes.scoreOne);
		ret += scoreMap.get(ScoreTypes.scoreTwo);
		ret += scoreMap.get(ScoreTypes.scoreThree);
		ret += scoreMap.get(ScoreTypes.scoreFour);
		ret += scoreMap.get(ScoreTypes.scoreFive);
		ret += scoreMap.get(ScoreTypes.scoreSix);
		ret += scoreMap.get(ScoreTypes.scoreBonus);
		return ret;
	}

	/**
	 * Adds all scores in bottom half
	 * @return Integer
	 */
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

	/**
	 * Add top half grand total with bottom half total
	 * @return Integer
	 */
	public int getGrandTotal() {
		return getTopGrandTotal() + getBottomTotal();
	}
}
